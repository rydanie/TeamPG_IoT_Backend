package com.myproject.iot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//this tells the program this is a thing
@Entity
public class Device {

    //when its looking for id it goes here
    @Id
    //tells generated value to do stuff here
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long devMacAddr;
    private String deviceName;
    private String gatewayName;


    public Device(long macAdd, String deviceName, String gateName) {
        this.devMacAddr = macAdd;
        this.deviceName = deviceName;
        this.gatewayName = gateName;
    }

    public Device() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
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

    public void setGatewayName(String gateName) {
        this.gatewayName = gateName;
    }

    @Override
    public String toString() {
        return "Device{" +
                "MacAddress=" + devMacAddr +
                ", device name='" + deviceName +
                ", gateway connected to='" + gatewayName+ '\''
                + '}';
    }
}
