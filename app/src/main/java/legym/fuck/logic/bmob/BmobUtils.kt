package legym.fuck.logic.bmob

import cn.bmob.v3.BmobQuery
import cn.bmob.v3.datatype.BmobQueryResult
import cn.bmob.v3.exception.BmobException
import cn.bmob.v3.listener.SQLQueryListener
import cn.bmob.v3.listener.SaveListener
import com.liangguo.androidkit.app.ToastUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import legym.fuck.config.AppConfig
import legym.fuck.core.export.BmobUserStore.changeIntegral
import legym.fuck.core.model.BmobUser
import legym.fuck.logic.OnlineData
import legym.fuck.logic.legym.network.model.login.LoginResult
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


/**
 * @author ldh
 * 时间: 2022/3/19 19:52
 *
 */

/**
 * 获取一个新的[BmobQuery]对象
 */
private val bmobQuery: BmobQuery<BmobSdkUser>
    get() = BmobQuery()


/**
 * 通过乐健的账号找到Bmob的账号
 *
 * 同步阻塞的方式
 *
 * 返回可能为空
 */
suspend fun getBmobDataByLegymId(legymId: String) = suspendCoroutine<BmobSdkUser?> {
    bmobQuery.setSQL("SELECT * FROM $BMOB_LEGYM_USER_TABLE WHERE userId = '$legymId'")
        .doSQLQuery(object : SQLQueryListener<BmobSdkUser>() {
            override fun done(p0: BmobQueryResult<BmobSdkUser>?, p1: BmobException?) {
                it.resume(p0?.results?.firstOrNull())
            }
        })
}

/**
 * 通过objectId查找Bmob用户
 */
suspend fun getBmobUserByObjectId(objectId: String) = suspendCoroutine<BmobSdkUser?> {
    bmobQuery.setSQL("SELECT * FROM $BMOB_LEGYM_USER_TABLE WHERE objectId = '$objectId'")
        .doSQLQuery(object : SQLQueryListener<BmobSdkUser>() {
            override fun done(p0: BmobQueryResult<BmobSdkUser>?, p1: BmobException?) {
                it.resume(p0?.results?.firstOrNull())
            }
        })
}

/**
 * 用挂起函数来同步注册新用户
 */
suspend fun BmobSdkUser.suspendSaveSync() = suspendCoroutine<String?> {
    save(object : SaveListener<String>() {
        override fun done(p0: String?, p1: BmobException?) {
            it.resume(p0)
        }
    })
}

/**
 * 基于账号和登录结果生成Bmob新用户
 */
fun LoginResult.generateBmobUser(legymId: String) = BmobSdkUser(
    userId = legymId,
    integral = 20F,
    vipDate = 0,
    schoolName = schoolName,
    organizationName = organizationName,
    year = year
)


/**
 * 检查账户是否还有积分
 */
inline fun checkHasIntegral(brake: () -> Unit): legym.fuck.core.model.BmobUser? {
    val currentUser = OnlineData.bmobUser.value
    if (!AppConfig.onLineConfig.value.enableConsumeIntegral) return currentUser
    if (currentUser != null) {
        if (currentUser.integral <= 0) {
            CoroutineScope(Dispatchers.Main).launch {
                ToastUtil.error("账户余额不足，请充值")
            }
            brake()
        }
    } else {
        CoroutineScope(Dispatchers.Main).launch {
            ToastUtil.error("账户不在线，请退出重启")
        }
        brake()
    }
    return currentUser
}

/**
 * 挂起函数为Bmob用户扣费
 * @param consumption 要扣多少
 * @param refresh 扣费之前是否再同步一次数据
 * @return 这次操作是否成功
 */
suspend fun legym.fuck.core.model.BmobUser.consume(consumption: Float, refresh: Boolean = false) =
    withContext(Dispatchers.IO) {
        if (!AppConfig.onLineConfig.value.enableConsumeIntegral) return@withContext false
        val result = changeIntegral(-consumption, refresh).data != null
        OnlineData.bmobUser.postValue(this@consume)
        result
    }

/**
 * 用户当前的状态是否是vip
 */
val BmobUser.isVip: Boolean
    get() = vipDate > System.currentTimeMillis()
