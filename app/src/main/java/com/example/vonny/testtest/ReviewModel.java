package com.example.vonny.testtest;

import com.google.gson.annotations.SerializedName;

public class ReviewModel {

    @SerializedName("_id")
    public String id;

    @SerializedName("user")
    public String user;

    @SerializedName("waktu")
    public String waktu;

    @SerializedName("textReview")
    public String textreview;

    @SerializedName("gambar")
    public String gambar;

    @SerializedName("jmlBintang")
    public int jmlBintang;

    @SerializedName("__v")
    public String v;

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getUser() {
        return user;
    }

    public void setTextreview(String textreview) {
        this.textreview = textreview;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJmlBintang(int jmlBintang) {
        this.jmlBintang = jmlBintang;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getTextreview() {
        return textreview;
    }

    public String getGambar() {
        return gambar;
    }

    public String getId() {
        return id;
    }

    public int getJmlBintang() {
        return jmlBintang;
    }

    public String getV() {
        return v;
    }
}
