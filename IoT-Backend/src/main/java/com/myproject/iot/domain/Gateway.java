package com.myproject.iot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//this tells the program this is a thing
@Entity
public class Gateway {

    //when its looking for id it goes here
    @Id
    //tells generated value to do stuff here
    @GeneratedValue(strategy = GenerationType.AUTO)

    //these are all the fields that are needed for the gateway
    private Long gateId;
    private Long ipAddress;
    private String GatewayName;

    //this is the actual gateway class, what the program thinks of
    //when it sees gateway
    public Gateway(Long macAdd, /*Long ipAdd,*/ String gateName) {
        this.gateId = macAdd;
        //this.ipAddress = ipAdd;
        this.GatewayName = gateName;
    }

    //this tells the program gateway itself doesn't do anything,
    // its just an object
    public Gateway() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public long getGateId() {
        return gateId;
    }

    public void setGateId(long macAdd) {
        this.gateId = macAdd;
    }

    /*public long getIPAddress() {
        return ipAddress;
    }*/

    /*public void setIpAddress(long ipAdd) {
        this.ipAddress = ipAdd;
    }*/

    public String getGatewayName() {
        return GatewayName;
    }

    public void setGatewayName(String gateName) {
        this.GatewayName = gateName;
    }

}
