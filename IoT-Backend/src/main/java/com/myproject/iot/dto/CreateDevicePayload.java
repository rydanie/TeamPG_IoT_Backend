package com.myproject.iot.dto;

public class CreateDevicePayload {

    private String name;
    private String conName;
    private Long id;

    public String getName() {
        return name;
    }

    public String getConName() {return conName;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }
}
