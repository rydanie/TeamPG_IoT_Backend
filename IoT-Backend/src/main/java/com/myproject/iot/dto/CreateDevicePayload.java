package com.myproject.iot.dto;
//comment
public class CreateDevicePayload {

    private String name;
    private String conName;
    private String macAdd;
    private long id;

    public String getName() { return name; }

    public String getConName() {return conName;}

    public String getMacAdd() {
        return macAdd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }
}
