package com.examp.Amazoff.Reposatory;

import com.examp.Amazoff.modelClass.DeliveryPartner;
import com.examp.Amazoff.modelClass.Order;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public int getOrderAssignByDeliveryPartner(String deliveryPartnerId) {
         // create a new list each call
        int count = 0;
        for (Order ob : ordersDb.values()) {
            if (deliveryPartnerId.equals(ob.getDeliveryPartnerId())) { // safer null check
               count++; // add actual order ID
            }
        }
        return count;
    }
    public List<Order> listAllOrder(){
        List<Order> orders = new ArrayList<>();
        for (Order ob : ordersDb.values()) {
            orders.add(ob);
        }
        return orders;
    }


    public List<Order> getUndeliverdOrders( String deliveryPartnerId,String delivery_staus) {
        List<Order>udo = new ArrayList<>();
        for(Order ob : ordersDb.values()){
            if(ob.getDeliveryPartnerId().equals(deliveryPartnerId) && ob.getDelivery_status().equals(delivery_staus)){
             udo.add(ob);
            }

        }

        return udo;
    }



}
