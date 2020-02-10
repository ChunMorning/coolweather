package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;


public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return  id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return  provinceName;
    }

    public  void setProvinceName(String name){
        this.provinceName = name;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int code){
        this.provinceCode = code;
    }


}
