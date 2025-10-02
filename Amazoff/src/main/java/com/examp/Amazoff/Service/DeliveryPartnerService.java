package com.examp.Amazoff.Service;

import com.examp.Amazoff.Reposatory.DeliveryPartnerReposatory;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerService {
   @Autowired
    DeliveryPartnerReposatory deliveryPartnerReposatory;
    public String addDeliveryPartner(DeliveryPartner deliveryPartner) {
        String responce = deleveryPartnerReposatory.addDeliveyParter(deliveryPartner);
        return responce;
    }

}
