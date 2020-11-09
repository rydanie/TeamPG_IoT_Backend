package com.myproject.iot.service;
//comment
//import all the things
import com.myproject.iot.domain.Gateway;
import com.myproject.iot.repository.GatewayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayService {

    @Autowired//creates gateway repository instance
    private GatewayRepository gatewayRepository;

    public Gateway addGateway(String name, String ip, String mac) {
        Gateway gateway = new Gateway();
        gateway.setName(name);
        gateway.setMacAdd(mac);
        gateway.setIpAddress(ip);
        return gatewayRepository.save(gateway);
    }

    public List<Gateway> getGateways() {
        return gatewayRepository.findAll();
    }
}
