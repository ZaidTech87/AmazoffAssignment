package com.examp.Amazoff.Controller;

import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleveryPartnerController")
public class DeliveryPartnerController {
    @Autowired
    DeliveryPartner deliveryPartnerService;
    public String addDeleveryPartner(@RequestBody DeliveryPartner deliveryPartner) {
        String responce = deliveryPartnerService.addDeliveryPartnerId(deliveryPartner);
        return responce;
    }

}