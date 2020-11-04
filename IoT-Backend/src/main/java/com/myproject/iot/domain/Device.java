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
    private long id;
    private String name;
    private String gatewayName;


    public Device(long id, String name, String gateName) {
        this.id = id;
        this.name = name;
        this.gatewayName = gateName;
    }

    public Device() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setGatewayName(String gateName) {
        this.gatewayName = gateName;
    }

    @Override
    public String toString() {
        return "Device{" +
                "MacAddress=" + id +
                ", device name='" + name +
                ", gateway connected to='" + gatewayName+ '\''
                + '}';
    }
}
