package com.examp.Amazoff.Reposatory;

import com.examp.Amazoff.modelClass.Order;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class OrderReposatory {
    HashMap<String,Order> ordersDb = new HashMap<>();
    public String  addOrder(Order order)
    {
        String key = order.getOrderId();
        ordersDb.put(key, order);
        return "Order is successfully added in orderdatabase";

    }
    public String assignOrdertoDeliveryPartner(String deliveryPartnerId,String orderId){
        if(!ordersDb.containsKey(orderId)){
            return "orderId  not found";
        }
        Order ob = ordersDb.get(orderId);
       ob.setDeliveryPartnerId(deliveryPartnerId);
       return "order"+orderId+"assigned to deleveyParner that idd is "+deliveryPartnerId;

    }
    public  Order getOrderbyId(@RequestParam String orderId){
        if(!ordersDb.containsKey(orderId)){
            return null;
        }
        Order order = ordersDb.get(orderId);
        return order;
    }

}
