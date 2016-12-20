package com.example.practicaltest.Network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by C4Q on 12/19/16.
 */

public class Service {
    public static final String BASE_URL = "http://vine.co";


    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    private static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(BASE_URL)
                                                  .addConverterFactory(GsonConverterFactory.create());

    public static <GetVibeAPI> GetVibeAPI createService(Class<GetVibeAPI> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }

}
