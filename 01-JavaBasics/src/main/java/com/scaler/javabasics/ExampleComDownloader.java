package com.scaler.javabasics;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ExampleComDownloader {
    OkHttpClient httpClient;
    Request.Builder requestBuilder = new Request.Builder().get().url("http://example.com");

    public ExampleComDownloader() {
        httpClient = new OkHttpClient.Builder().build();
    }

    String getWebpageSource() {
        Request webPageRequest = requestBuilder.build();
        try {
            Response response = httpClient.newCall(webPageRequest).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
