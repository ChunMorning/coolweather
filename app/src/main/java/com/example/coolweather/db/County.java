package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;


public class County extends LitePalSupport {

    private int id;
    private String countyName;
    private int countyCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){
        return  countyName;
    }

    public void setCityName(String cityName){
        this.countyName = cityName;
    }

    public  int getCityCode(){
        return  countyCode;
    }

    public void setCityCode(int code){
        this.countyCode = code;
    }
}
