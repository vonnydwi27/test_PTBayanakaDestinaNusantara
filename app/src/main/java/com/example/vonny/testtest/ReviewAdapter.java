package com.example.vonny.testtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private List<ReviewModel> reviewModelList;
    Context context;
    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView review, user, waktu;
        public ImageView gambar;
        public RatingBar rating;
        public RelativeLayout relativeLayout;

        public ViewHolder(View ItemView)
        {
            super(ItemView);
            review=itemView.findViewById(R.id.tvreview);
            user=itemView.findViewById(R.id.tvnama);
            waktu=itemView.findViewById(R.id.tvwaktu);
            gambar=itemView.findViewById(R.id.img_view);
            relativeLayout=itemView.findViewById(R.id.rv_view);
            rating=itemView.findViewById(R.id.rating);
        }
    }

    public ReviewAdapter(Context context, List<ReviewModel> reviewModelList)
    {
        this.context=context;
        this.reviewModelList=reviewModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_review,parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        ReviewModel reviewModel = reviewModelList.get(i);
        holder.rating.setNumStars(reviewModel.getJmlBintang());
       holder.review.setText(reviewModel.getTextreview());
       holder.user.setText(reviewModel.getUser());
       holder.waktu.setText(reviewModel.getWaktu());

    }

    @Override
    public int getItemCount() {
        return reviewModelList.size();
    }
}
