package com.example.vonny.testtest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EndPoint {

    @POST("/reviews/create")
    Call<ReviewResponse> doReview(@Body ReviewRequest data);
}
