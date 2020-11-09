package com.myproject.iot.domain;
//comment

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
    private long id;
    private String ipAddress;
    private String name;
    private String macAdd;

    //this is the actual gateway class, what the program thinks of
    //when it sees gateway
    public Gateway(long id, String ipAdd, String gateName, String macAdd) {
        this.id = id;
        this.ipAddress = ipAdd;
        this.name = gateName;
        this.macAdd = macAdd;
    }

    //this tells the program gateway itself doesn't do anything,
    // its just an object
    public Gateway() {

    }

    //FRONTEND STUFF BELOW
    //this is all fun/useful stuff
    //it gets/sets all the info
    public long getId() {
        return id;
    }

    public void setId(long macAdd) {
        this.id = macAdd;
    }

    public String getIPAddress() {
        return ipAddress;
    }

    public void setIpAddress(String  ipAdd) {
        this.ipAddress = ipAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String gateName) {
        this.name = gateName;
    }

    public String getMacAdd() {
        return macAdd;
    }

    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;
    }

}
