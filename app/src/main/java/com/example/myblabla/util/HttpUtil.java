package com.example.myblabla.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yijia_gong on 17/10/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
