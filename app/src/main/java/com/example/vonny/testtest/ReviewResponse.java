package com.example.vonny.testtest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewResponse {

    @SerializedName("")
    private List<ReviewModel> data;

    public List<ReviewModel> getData() {
        return data;
    }
    public void setData(List<ReviewModel> data) {
        this.data = data;
    }

}
