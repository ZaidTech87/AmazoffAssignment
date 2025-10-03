package com.examp.Amazoff.Service;

import com.examp.Amazoff.Reposatory.DeliveryPartnerReposatory;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DeliveryPartnerService {
   @Autowired
    DeliveryPartnerReposatory deliveryPartnerReposatory;
    public String addDeliveryPartner(DeliveryPartner deliveryPartner) {
        String responce =deliveryPartnerReposatory.addDeliveryPartner(deliveryPartner);
        return responce;
    }

    public DeliveryPartner getDeliveryPartnerById(@RequestParam String deliveryPartnerId) {
        DeliveryPartner deliveryPartner = deliveryPartnerReposatory.getDeliveryPartnerById(deliveryPartnerId);
        return deliveryPartner;
    }

}
