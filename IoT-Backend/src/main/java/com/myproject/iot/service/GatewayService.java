package com.myproject.iot.service;

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

    public Gateway addGateway(String name/*, String mac, String ip*/) {
        Gateway gateway = new Gateway();
        gateway.setName(name);
        gateway.setMacAdd("Hi");
        gateway.setIpAddress("Sharbel's Van");
        return gatewayRepository.save(gateway);
    }

    public List<Gateway> getGateways() {
        return gatewayRepository.findAll();
    }
}
