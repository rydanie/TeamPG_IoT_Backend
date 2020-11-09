package com.myproject.iot.dto;
//comment
public class DeviceDto {

    private long id;
    private String macAdd;
    private String name;
    private String conName;

    public DeviceDto() {
    }

    public DeviceDto(long id, String name,  String macAdd, String conName) {
        this.id = id;
        this.name = name;
        this.macAdd = macAdd;
        this.conName = conName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConName() {return conName;}

    public void setConName(String conName) {this.conName = conName;}

    public String getMacAdd(){return macAdd;}

    public void setMacAdd(String macAdd){this.macAdd = macAdd;}
}
