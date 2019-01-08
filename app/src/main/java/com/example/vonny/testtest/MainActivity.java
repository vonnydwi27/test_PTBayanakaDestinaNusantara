package com.example.vonny.testtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    public RatingBar ratingBar;
    private EditText review;
    private Button kirim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.rating);
        review = findViewById(R.id.ed_review);
        kirim = findViewById(R.id.butonkirim);
        ReviewRequest reviewRequest = new ReviewRequest();

        kirim.setOnClickListener((View V) ->{

            reviewRequest.setTextreview(review.getText().toString());
            EndPoint service = Retrofit.getRetrofitInstance(MainActivity.this).create(EndPoint.class);
            Call<ReviewResponse> call = service.doReview(reviewRequest);
            call.enqueue(new Callback<ReviewResponse>() {
                @Override
                public void onResponse(Call<ReviewResponse> call, Response<ReviewResponse> response) {

                }

                @Override
                public void onFailure(Call<ReviewResponse> call, Throwable t) {

                }
            });
        });

    }

    public void rateme(View view)
    {Toast.makeText(getApplicationContext(),String.valueOf(ratingBar.getRating()), Toast.LENGTH_LONG).show();

    }




}
