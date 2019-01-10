package com.example.vonny.testtest;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static OkHttpClient okHttpClient;
    private static HttpLoggingInterceptor httpLoggingInterceptor;
    private static retrofit2.Retrofit retrofit;
    private static Context appContext;

    public static retrofit2.Retrofit getRetrofitInstance (Context context)
    {
        httpLoggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        appContext = context;
        final SessionManager sessionManager = new SessionManager(appContext);
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(chain ->
                {
                    Request original = chain.request();
                    Request request = original.newBuilder()
                            .header ("Authorization", ((sessionManager != null )? sessionManager.getToken(): ""))
                            .header ("Content-Type", "application/json")
                            .method (original.method(),original.body())
                            .build();
                    return chain.proceed(request);
                })
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build();
        if (retrofit == null)
        {
            retrofit=new retrofit2.Retrofit.Builder()
                    .baseUrl("https://dry-fortress-35321.herokuapp.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();

        }

        return retrofit;
    }

}
