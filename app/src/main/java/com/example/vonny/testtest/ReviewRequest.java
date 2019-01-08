package com.example.vonny.testtest;

import com.google.gson.annotations.SerializedName;

public class ReviewRequest {

    @SerializedName("textReview")
    private String textreview;

    @SerializedName("gambar")
    private String gambar;

    @SerializedName("jmlBinitang")
    private String jmlhbintang;

    @SerializedName("user")
    private String user;

    @SerializedName("waktu")
    private String waktu;

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void setJmlhbintang(String jmlhbintang) {
        this.jmlhbintang = jmlhbintang;
    }

    public void setTextreview(String textreview) {
        this.textreview = textreview;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getGambar() {
        return gambar;
    }

    public String getJmlhbintang() {
        return jmlhbintang;
    }

    public String getTextreview() {
        return textreview;
    }

    public String getUser() {
        return user;
    }

    public String getWaktu() {
        return waktu;
    }
}
