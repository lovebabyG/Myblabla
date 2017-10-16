package com.example.myblabla.db;

/**
 * Created by yijia_gong on 16/10/17.
 */

public class Country {
    private int id;
    private String countryName;
    private String weatherId;
    private int ciyId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCiyId(int ciyId) {
        this.ciyId = ciyId;
    }

    public int getId() {

        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCiyId() {
        return ciyId;
    }
}
