package com.myproject.iot.service;
//comment
import com.myproject.iot.domain.Device;
import com.myproject.iot.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public Device addDevice(String name, String macAdd, String conName) {
        Device device = new Device();
        device.setName(name);
        device.setMacAdd(macAdd);
        device.setConName(conName);
        return deviceRepository.save(device);
    }

    public List<Device> getDevices() {
        return deviceRepository.findAll();
    }

    public void deleteDevice(Long id){
        deviceRepository.deleteById(id);
    }

    public Device getDevice(Long id){
        return deviceRepository.getOne(id);
    }

    public Device editDevice(long id, String name, String macAdd, String conName){
        Device device = new Device();
        device.setId(id);
        device.setName(name);
        device.setMacAdd(macAdd);
        device.setConName(conName);
        return deviceRepository.save(device);
    }
}
