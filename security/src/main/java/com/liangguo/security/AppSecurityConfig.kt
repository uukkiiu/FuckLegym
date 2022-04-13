package com.liangguo.security


/**
 * @author ldh
 * 时间: 2022/3/24 12:51
 *
 */
object AppSecurityConfig {

    init {
        System.loadLibrary("native-lib")
    }


    external fun getCloudBaseUrl(): String

    external fun getBuglyId(): String

    external fun getBmobAppKey(): String

    external fun getAesKeyFromJNI(): String

}