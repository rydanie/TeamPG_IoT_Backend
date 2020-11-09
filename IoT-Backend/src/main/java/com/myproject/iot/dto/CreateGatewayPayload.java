package com.myproject.iot.dto;
//comment
public class CreateGatewayPayload {

    private String name;
    private String macAdd;
    private String ipAdd;
    private long id;

    public String getGatewayName() {
        return name;
    }

    public String getMacAdd() {return macAdd;}

    public String getIpAdd() {return ipAdd;}

    public void setGatewayName(String name) {
        this.name = name;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

