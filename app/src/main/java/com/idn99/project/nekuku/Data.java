package com.idn99.project.nekuku;

public class Data {
    private int gambarData;
    private String judulData;
    private String musimData;
    private String deskripsiData;
    private String sinopsisData;

    public Data(int gambarData, String judulData, String musimData, String deskripsiData, String sinopsisData) {
        this.gambarData = gambarData;
        this.judulData = judulData;
        this.musimData = musimData;
        this.deskripsiData = deskripsiData;
        this.sinopsisData = sinopsisData;
    }

    public int getGambarData() {
        return gambarData;
    }

    public String getJudulData() {
        return judulData;
    }

    public String getMusimData() {
        return musimData;
    }

    public String getDeskripsiData() {
        return deskripsiData;
    }

    public String getSinopsisData() {
        return sinopsisData;
    }
}
