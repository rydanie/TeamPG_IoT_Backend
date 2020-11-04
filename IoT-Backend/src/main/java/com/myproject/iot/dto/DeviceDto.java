package com.myproject.iot.dto;

public class DeviceDto {

    private long id;
    private String name;
    private String gatewayName;

    public DeviceDto() {

    }

    public DeviceDto(long macAdd, String devName, String gateName) {
        this.id = macAdd;
        this.name = devName;
        this.gatewayName = gateName;
    }

    public long getId() {
        return id;
    }

    public void setId(long macAdd) {
        this.id = macAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String name) {
        this.gatewayName = name;
    }
}
