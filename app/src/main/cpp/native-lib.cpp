#include <jni.h>
#include <string>
#include <android/native_window.h>
#include <android/native_window_jni.h>

extern "C" JNIEXPORT void JNICALL
Java_com_anative_jaccen_glnative_ARRender_nativeInit(
        JNIEnv *env,
        jobject /* this */) {

}

extern "C" JNIEXPORT void JNICALL
Java_com_anative_jaccen_glnative_ARRender_nativeRelease(
        JNIEnv *env,
        jobject /* this */) {

}


extern "C" JNIEXPORT void JNICALL
Java_com_anative_jaccen_glnative_ARRender_onSurfaceCreated(JNIEnv *env, jobject instance,
                                                               jobject surface) {

}


extern "C" JNIEXPORT void JNICALL
Java_com_anative_jaccen_glnative_ARRender_onSurfaceChanged(JNIEnv *env, jobject instance,
                                                               jint width, jint height){

}


extern "C" JNIEXPORT void JNICALL
Java_com_anative_jaccen_glnative_ARRender_onSurfaceDestroyed(
        JNIEnv *env,
        jobject /* this */) {

}

