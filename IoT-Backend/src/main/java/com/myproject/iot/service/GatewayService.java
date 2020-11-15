package com.myproject.iot.service;
//comment
//import all the things
import com.myproject.iot.domain.Device;
import com.myproject.iot.domain.Gateway;
import com.myproject.iot.repository.GatewayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteGateway(Long id){
        gatewayRepository.deleteById(id);
    }

    public Gateway getGateway(Long id){
        Optional<Gateway> optionalGateway = gatewayRepository.findById(id);
        if(optionalGateway.isPresent()){
            return optionalGateway.get();
        }
        else{
            return new Gateway();
        }
    }

    public Gateway save(Gateway gateway){
        return gatewayRepository.save(gateway);
    }

    public List<Gateway> getGateways() {
        return gatewayRepository.findAll();
    }
}
