package com.example.vonny.testtest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EndPoint {

    @GET("/reviews/create")
    Call<ReviewResponse> getReview();

}
