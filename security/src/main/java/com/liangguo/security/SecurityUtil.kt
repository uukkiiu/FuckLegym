package com.liangguo.security

import android.content.Context
import android.text.TextUtils
import com.framgia.android.emulator.EmulatorDetector
import fucklegym.security.order.sign.LegymOrderSigner


/**
 * @author ldh
 * 时间: 2021/12/2 20:14
 *
 */
object SecurityUtil {

    /**
     * 整个app默认的加密工具
     */
    private val defaultAESUtil =
        LegymOrderSigner(AppSecurityConfig.getAesKeyFromJNI())

    val inviteCodeAesUtil = AesUtil(AppSecurityConfig.getAesKeyFromJNI())

    fun generateCryptSign(timeMiles: Long, legymId: String) = defaultAESUtil.generateCryptSign(timeMiles, legymId)

    /**
     * 检测是否为模拟器
     */
    fun detectEmulator(context: Context, result: (isEmulator: Boolean) -> Unit) {
        EmulatorDetector.with(context)
            .setDebug(false)
            .detect(result)
    }


}

/**
 * 判断设备 是否使用代理上网
 */
val isProxy: Boolean
    get() {
        val proxyPort: Int
        var proxyAddress: String? = null
        System.getProperty("http.proxyHost")?.let {
            proxyAddress = it
        }
        val portStr = System.getProperty("http.proxyPort")
        proxyPort = (portStr ?: "-1").toInt()
        return !TextUtils.isEmpty(proxyAddress) && proxyPort != -1
    }