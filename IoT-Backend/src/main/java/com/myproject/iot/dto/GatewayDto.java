package com.myproject.iot.dto;

import com.myproject.iot.domain.Gateway;

public class GatewayDto {

    //these are all the fields that are needed for the gateway
    private long gateId;
    private long ipAddress;
    private String GatewayName;

    public GatewayDto() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public GatewayDto(long macAdd, /*long ipAdd,*/ String gateName) {
        this.gateId = macAdd;
        //this.ipAddress = ipAdd;
        this.GatewayName = gateName;
    }

    public long getGateMacId() {
        return gateId;
    }

    public void setGateId(long macAdd) {
        this.gateId = macAdd;
    }

    /*public long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(long ipAdd) {
        this.ipAddress = ipAdd;
    }
    */
    public String getGatewayNameName() {
        return GatewayName;
    }

    public void setGatewayName(String name) {
        this.GatewayName = name;
    }
}
