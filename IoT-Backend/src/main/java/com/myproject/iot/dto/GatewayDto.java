package com.myproject.iot.dto;

public class GatewayDto {

    //these are all the fields that are needed for the gateway
    private long id;
    private String ipAddress;
    private String name;
    private String macAdd;

    public GatewayDto() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public GatewayDto(long id, String name, String ipAdd, String macAdd) {
        this.id = id;
        this.ipAddress = ipAdd;
        this.name = name;
        this.macAdd = macAdd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIPAddress() {
        return ipAddress;
    }

    public void setIpAddress(String  ipAdd) {
        this.ipAddress = ipAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAdd() {
        return macAdd;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }
}
