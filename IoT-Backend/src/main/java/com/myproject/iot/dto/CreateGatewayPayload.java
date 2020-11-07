package com.myproject.iot.dto;

public class CreateGatewayPayload {

    private String GatewayName;
    private String macAdd;
    private String ipAdd;
    private long id;

    public String getGatewayName() {
        return GatewayName;
    }

    public String getMacAdd() {return macAdd;}

    public String getIpAdd() {return ipAdd;}

    public void setGatewayName(String name) {
        this.GatewayName = name;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }
}

