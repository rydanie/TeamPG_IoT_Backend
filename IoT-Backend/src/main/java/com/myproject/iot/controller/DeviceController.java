package com.myproject.iot.controller;

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

@RestController
@RequestMapping("/devices")
public class DeviceController {
    //order of mapping HTTP things doesn't matter as long as they are mapped before they are used

    //this enables us to implicitly inject object dependency
    @Autowired//this is a best practice thing, seperates buieness function from server functions
    private DeviceService deviceService;

    /*@Autowired
    private DeviceRepository deviceRepository;
     */

    //maps HTTP POST requests onto specific handlers
    @PostMapping("/")
    public ResponseEntity<Device> addDevice(@RequestBody CreateDevicePayload payload) {
        return new ResponseEntity<>(deviceService.addDevice(payload.getName()), HttpStatus.CREATED);
    }

    //@GetMapping("")
    //public List<Router> getAll() {
    //    return routerRepository.findAll();
    //}

    //this is part of the HTTP mapping and puts the GET requests on specific handler methods
    @GetMapping("/")
    public List<DeviceDto> getDevices() {//this is getting the list of devices from Dto
        return deviceService.getDevices()
               //these are methods contained within the object
                .stream()
                .map(device -> new DeviceDto(device.getId(), device.getName()))
                //this is just the stuff it is returning
                .collect(Collectors.toList());
    }

    // Exercise: add the code delete a device and test it, see DeviceRepository class
}
