package com.example.myblabla.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yijia_gong on 17/10/17.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
