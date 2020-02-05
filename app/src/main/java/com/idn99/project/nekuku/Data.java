package com.idn99.project.nekuku;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
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

    protected Data(Parcel in) {
        gambarData = in.readInt();
        judulData = in.readString();
        musimData = in.readString();
        deskripsiData = in.readString();
        sinopsisData = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(gambarData);
        dest.writeString(judulData);
        dest.writeString(musimData);
        dest.writeString(deskripsiData);
        dest.writeString(sinopsisData);
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>(){
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}
