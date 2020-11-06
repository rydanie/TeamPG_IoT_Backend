package com.myproject.iot.dto;

public class DeviceDto {

    private long id;
    private String name;
    private String conName;

    public DeviceDto() {
    }

    public DeviceDto(long id, String name, String conName) {
        this.id = id;
        this.name = name;
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
}
