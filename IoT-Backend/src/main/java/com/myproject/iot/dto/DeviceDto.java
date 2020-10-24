package com.myproject.iot.dto;

public class DeviceDto {

    private long devMacAddr;
    private String deviceName;
    private String gatewayName;

    public DeviceDto() {

    }

    public DeviceDto(long macAdd, String devName, String gateName) {
        this.devMacAddr = macAdd;
        this.deviceName = devName;
        this.gatewayName = gateName;
    }

    public long getDevMacAdd() {
        return devMacAddr;
    }

    public void setDevMacAdd(long macAdd) {
        this.devMacAddr = macAdd;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String name) {
        this.deviceName = name;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String name) {
        this.gatewayName = name;
    }
}
