package com.example.kotlindemo.utils

import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request

object HttpUtil {
    fun sendOkHttpRequest(address:String,callback:Callback) {
        val okHttpClient = OkHttpClient();
        val request = Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}