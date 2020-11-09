package com.myproject.iot.dto;
//comment
import com.myproject.iot.domain.Gateway;

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
    public GatewayDto(long id, String gateName, String macAdd, String ipAdd) {
        this.id = id;
        this.ipAddress = ipAdd;
        this.name = gateName;
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

    public String getGatewayName() {
        return name;
    }

    public void setGatewayName(String gateName) {
        this.name = gateName;
    }

    public String getMacAdd() {
        return macAdd;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }
}
