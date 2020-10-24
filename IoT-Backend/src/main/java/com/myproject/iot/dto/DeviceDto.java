package com.myproject.iot.dto;

public class DeviceDto {

    private long macAddress;
    private String deviceName;
    private String gatewayName;

    public DeviceDto() {
    }

    public DeviceDto(long id, String name, String gateName) {
        this.macAddress = id;
        this.deviceName = name;
        this.gatewayName = gateName;
    }

    public long getId() {
        return macAddress;
    }

    public void setId(long id) {
        this.macAddress = id;
    }

    public String getName() {
        return deviceName;
    }

    public void setName(String name) {
        this.deviceName = name;
    }
}
