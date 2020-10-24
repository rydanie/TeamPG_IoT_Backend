package com.myproject.iot.dto;

import com.myproject.iot.domain.Gateway;

public class GatewayDto {

    //these are all the fields that are needed for the gateway
    private long gateMacAddr;
    private long ipAddress;
    private String gatewayName;

    public GatewayDto() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public GatewayDto(long macAdd, long ipAdd, String gateName) {
        this.gateMacAddr = macAdd;
        this.ipAddress = ipAdd;
        this.gatewayName = gateName;
    }

    public long getGateMacAddr() {
        return gateMacAddr;
    }

    public void setGateMacAddr(long macAdd) {
        this.gateMacAddr = macAdd;
    }

    public long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(long ipAdd) {
        this.ipAddress = ipAdd;
    }

    public String getGatewayNameName() {
        return gatewayName;
    }

    public void setGatewayName(String name) {
        this.gatewayName = name;
    }
}
