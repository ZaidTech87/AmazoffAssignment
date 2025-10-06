package com.examp.Amazoff.Reposatory;

import com.examp.Amazoff.Service.DeliveryPartnerService;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Repository
public class DeliveryPartnerReposatory extends OrderReposatory {
    DeliveryPartnerService obj = new DeliveryPartnerService();
    HashMap<String, DeliveryPartner> dpDb= new HashMap<>();
    public String addDeliveryPartner(DeliveryPartner deliveryPartner){
        String key = deliveryPartner.getDeliveryPartnerId();
        dpDb.put(key, deliveryPartner);
        return "DeleveryPatner Successfully added in databse";

    }

    public DeliveryPartner getDeliveryPartnerById(@RequestParam String deliveryPartnerId) {
        if(dpDb.containsKey(deliveryPartnerId)){
            return null;
        }
        DeliveryPartner deliveryPartner = dpDb.get(deliveryPartnerId);
        return deliveryPartner;
    }

public String deleteDeliveryPartner(@RequestParam String deliveryPartnerId) {
    String unAssign = "";

        for(String key : dpDb.keySet()){
            if(key.equals(deliveryPartnerId)){
             unAssign =   unassignOrder(key);
                dpDb.remove(key);
            }
        }
        return "DeleveryPatner Successfully Deleted in databse And "  + unAssign;
}

}
