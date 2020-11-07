package com.myproject.iot.controller;

import com.myproject.iot.domain.Device;
import com.myproject.iot.dto.CreateDevicePayload;
import com.myproject.iot.dto.DeviceDto;
import com.myproject.iot.repository.DeviceRepository;
import com.myproject.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/devices")
public class Controller {

    @Autowired
    private DeviceService deviceService;
    private DeviceRepository deviceRepository;

    @PostMapping("/addDevice")
    public ResponseEntity<Device> addDevice(@RequestBody CreateDevicePayload payload) {
        return new ResponseEntity<>(deviceService.addDevice(payload.getName(), payload.getConName(),
                payload.getConName()), HttpStatus.CREATED);
    }

    @GetMapping("/getDevices")
    public List<DeviceDto> getDevices() {
        return deviceService.getDevices()
                .stream()
                .map(device -> new DeviceDto(device.getId(), device.getName(), device.getMacAdd(),
                        device.getConName()))
                .collect(Collectors.toList());
    }

    @DeleteMapping("")
    public void delete(@RequestParam(name = "id") long id){
        deviceRepository.deleteById(id);
    }

}
