package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;


public class County extends LitePalSupport {

    private int id;
    private String countyName;
    private int countyCode;
    private int cityId;
    private String weatherId;

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

    public  int getCityId(){
        return cityId;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return  countyName;
    }

    public void setCountyName(String cityName){
        this.countyName = cityName;
    }

    public  int getCountyCode(){
        return  countyCode;
    }

    public void setCountyCode(int code){
        this.countyCode = code;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public String getWeatherId(){
        return  weatherId;
    }
}
