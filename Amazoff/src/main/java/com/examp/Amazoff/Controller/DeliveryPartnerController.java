package com.examp.Amazoff.Controller;

import com.examp.Amazoff.Service.DeliveryPartnerService;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveryPartnerController")
public class DeliveryPartnerController {
   @Autowired
    DeliveryPartnerService deliveryPartnerService;
   @PostMapping("/addDeliveryPartner")
    public String addDeliveryPartner(@RequestBody DeliveryPartner deliveryPartner) {
        String responce = deliveryPartnerService.addDeliveryPartner(deliveryPartner);
        return responce;
    }
    @GetMapping("/getPartnerById")
    public DeliveryPartner getDeliveryPartnerById(@RequestParam  String deliveryPartnerId) {
       DeliveryPartner deliveryPartner = deliveryPartnerService.getDeliveryPartnerById(deliveryPartnerId);
       return deliveryPartner;

    }
    @DeleteMapping("/getDeletionOfPartnerObject")
    public String deleteDeliveryPartner(@RequestParam String deliveryPartnerId) {
       return deliveryPartnerService.deleteDeliveryPartner(deliveryPartnerId);
    }


}