package com.myproject.iot.controller;
//comment
//this imports eveything we need
import com.myproject.iot.domain.Device;
import com.myproject.iot.domain.Gateway;
import com.myproject.iot.dto.CreateDevicePayload;
import com.myproject.iot.dto.CreateGatewayPayload;
import com.myproject.iot.dto.GatewayDto;
import com.myproject.iot.service.GatewayService;
import com.myproject.iot.repository.GatewayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;//this im

//this is navigation stuff
@RestController
@RequestMapping("/gateways")
public class GatewayController {
    //order of mapping HTTP things doesn't matter as long as they are mapped before they are used

    //this enables us to implicitly inject object dependency
    @Autowired//this is a best practice thing, seperates buieness function from server functions
    private GatewayService gatewayService;
    private GatewayRepository gatewayRepository;


    //maps HTTP POST requests onto specific handlers
    @PostMapping("/")
    public ResponseEntity<Gateway> addGateway(@RequestBody CreateGatewayPayload payload) {
        return new ResponseEntity<>(gatewayService.addGateway(payload.getName(),
                payload.getIpAdd(),payload.getMacAdd() ), HttpStatus.CREATED);
    }

    //this is part of the HTTP mapping and puts the GET requests on specific handler methods
    @GetMapping("/getgateways")
    public List<GatewayDto> getGateways() {//this is getting the list of devices from Dto
        return gatewayService.getGateways()
                //these are methods contained within the object
                .stream()
                .map(gateway -> new GatewayDto(gateway.getId(), gateway.getName(),
                        gateway.getIPAddress(), gateway.getMacAdd()))
                //this just gathers all the stuff to display it
                .collect(Collectors.toList());
    }

    //when told to delete something it goes here
    @DeleteMapping("/deleteGateways/{id}")
    public ResponseEntity<String> deleteDevice(@PathVariable Long id){
        gatewayService.deleteGateway(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    //this mapping is for putting something in a specific place
    @PutMapping("/editGateway")
    public ResponseEntity<Gateway> editGateway(@RequestBody CreateGatewayPayload payload) {
        Gateway gateway = gatewayService.getGateway(payload.getId());
        gateway.setIpAddress(payload.getIpAdd());
        gateway.setMacAdd(payload.getMacAdd());
        gatewayService.changeDevice(payload.getName(), payload.getId());
        gateway.setName(payload.getName());
        return ResponseEntity.ok(gatewayService.save(gateway));

    }
}
