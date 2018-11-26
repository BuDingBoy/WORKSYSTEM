package com.lzp.domain;

public class FlightInfoParams {
    private  String dpt;
    private String arr;
    private String date;
    private String ex_track;

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEx_track() {
        return ex_track;
    }

    public void setEx_track(String ex_track) {
        this.ex_track = ex_track;
    }
}
