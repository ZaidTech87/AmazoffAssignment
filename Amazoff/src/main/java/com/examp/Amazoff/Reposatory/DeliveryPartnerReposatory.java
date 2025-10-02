package com.examp.Amazoff.Reposatory;

import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DeliveryPartnerReposatory {
    HashMap<String, DeliveryPartner> dpDb= new HashMap<>();
    public String addDeliveryPartner(DeliveryPartner deliveryPartner){
        String key = deliveryPartner.getDeliveryPartnerId();
        dpDb.put(key, deliveryPartner);
        return "DeleveryPatner Successfully added in databse";

    }
}
