//this groups all the classes and helps avoid naming conflicts
package com.myproject.iot.controller;

//import all this stuff cause there are a lot of calls going on
import com.myproject.iot.domain.Device;
import com.myproject.iot.dto.CreateDevicePayload;
import com.myproject.iot.dto.DeviceDto;
import com.myproject.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//I think this is part of setting this as the default
@RestController
@RequestMapping("/default")

//this makes her run
public class DefaultController {

    //this enables us to implicitly inject object dependency
    @Autowired
    //private DeviceRepository deviceRepository; doesn't like this as device repository is not set up
    private DeviceService deviceService;

    //this is part of the HTTP mapping and puts the GET requests on specific handler methods
    @GetMapping("")
    public String defaultGetMethod () {
        return "received in defaultGetMethod";
    }

    //COMMENTED OUT AS USE IS UNCERTIAN
    //this pulls repository and allows HTTP to map it
    //@GetMapping("getall")
    //public List<Device> defaultGetAll () {
    //    return deviceRepository.findAll();
    //}

    //maps HTTP POST requests onto specific handlers
    @PostMapping("")
    public String defaultPostMethod (@RequestBody String body) {
        return body;
    }
}
