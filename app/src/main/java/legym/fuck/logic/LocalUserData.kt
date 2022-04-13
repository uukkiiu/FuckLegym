package legym.fuck.logic

import com.tencent.mmkv.MMKV
import legym.fuck.config.defaultMMKV
import legym.fuck.logic.clouds.model.DocInfo


/**
 * @author ldh
 * 时间: 2022/3/17 21:57
 *
 */
object LocalUserData {

    private const val KEY_USER_ID = "KEY_USER_ID"
    private const val KEY_USER_PASSWORD = "KEY_USER_PASSWORD"

    /**
     * 储存在本地的账号
     */
    var userId: String?
        get() = MMKV.defaultMMKV().decodeString(KEY_USER_ID)
        set(value) {
            MMKV.defaultMMKV().encode(KEY_USER_ID, value)
        }


    /**
     * 储存在本地的密码
     */
    var password: String?
        get() = MMKV.defaultMMKV().decodeString(KEY_USER_PASSWORD)
        set(value) {
            MMKV.defaultMMKV().encode(KEY_USER_PASSWORD, value)
        }


    /**
     * 本地储存的信息，文档是否已读
     */
    var DocInfo.hasRead: Boolean
        get() = defaultMMKV.getString("Doc - $id", null) != null
        set(value) {
            defaultMMKV.putString("Doc - $id", if (value) id else null)
            OnlineData.unreadDocList.let { flow ->
                val newData = mutableListOf<DocInfo>()
                newData.addAll(flow.value)
                if (value) {
                    newData.removeAll { it.id == id }
                } else if (newData.find { it.id == id } == null) {
                    newData.add(this)
                }
                flow.tryEmit(newData)
            }
        }
}