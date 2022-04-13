#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_liangguo_security_AppSecurityConfig_getCloudBaseUrl(
        JNIEnv* env,
        jobject /* this */) {

    std::string value = "https://foreverddb.github.io/FLclouds/";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_liangguo_security_AppSecurityConfig_getBuglyId(
        JNIEnv* env,
        jobject /* this */) {

    std::string value = "9333bb0d44";
    return env->NewStringUTF(value.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_liangguo_security_AppSecurityConfig_getBmobAppKey(
        JNIEnv* env,
        jobject /* this */) {

    std::string value = "3e655bebbef14053524bc2c07d727468";
    return env->NewStringUTF(value.c_str());
}


extern "C" JNIEXPORT jstring JNICALL
Java_com_liangguo_security_AppSecurityConfig_getAesKeyFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string key = "1430377652863761";
    return env->NewStringUTF(key.c_str());
}