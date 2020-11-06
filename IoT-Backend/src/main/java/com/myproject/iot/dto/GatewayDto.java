package com.myproject.iot.dto;

import com.myproject.iot.domain.Gateway;

public class GatewayDto {

    //these are all the fields that are needed for the gateway
    private long id;
    private long ipAddress;
    private String name;

    public GatewayDto() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public GatewayDto(long macAdd, /*long ipAdd,*/ String gateName) {
        this.id = macAdd;
        //this.ipAddress = ipAdd;
        this.name = gateName;
    }

    public long getGateMacId() {
        return id;
    }

    public void setGateId(long macAdd) {
        this.id = macAdd;
    }

    /*public long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(long ipAdd) {
        this.ipAddress = ipAdd;
    }
    */
    public String getGatewayNameName() {
        return name;
    }

    public void setGatewayName(String name) {
        this.name = name;
    }
}
