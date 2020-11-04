package com.myproject.iot.service;

import com.myproject.iot.domain.Device;
import com.myproject.iot.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public Device addDevice(String name) {
        Device device = new Device();
        device.setName(name);
        return deviceRepository.save(device);
    }

    public List<Device> getDevices() {
        return deviceRepository.findAll();
    }

    /*This is where we should be deleting bu the other one works
    public void deleteDevice(Long deleteId){
        Device device = deviceRepository.getOne(deleteId);
        deviceRepository.delete(device);
    }
     */
}
