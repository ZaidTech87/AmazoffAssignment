package com.examp.Amazoff.Service;

import com.examp.Amazoff.Reposatory.OrderReposatory;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import com.examp.Amazoff.modelClass.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service

public class OrderService {
    @Autowired
    OrderReposatory orderReposatory;
    public String addOrder(Order order){
        String  response = orderReposatory.addOrder(order);
        return response;

    }

    public String assignOrdertoDeliveryParter(String deliveryPartnerId,String orderId){
       String responce = orderReposatory.assignOrdertoDeliveryPartner(deliveryPartnerId,orderId);
       return responce;
    }

 public  Order getOrderbyId(String orderId){
        Order order1 = orderReposatory.getOrderbyId(orderId);
        return order1;
 }

 public int getOrderAssignByDeliveryPartner(String deliveryPartnerId){
//        List<String> responce = orderReposatory.getOrderAssignByDeliveryPartner(deliveryPartnerId);
//        return responce;
     return orderReposatory.getOrderAssignByDeliveryPartner(deliveryPartnerId);
 }

 public List<Order>listAllOrder(){
        return orderReposatory.listAllOrder();
 }
    public List<Order> getUndeliverdOrders( String deliveryPartnerId,String delivery_staus) {
        return orderReposatory.getUndeliverdOrders(deliveryPartnerId,delivery_staus);
    }

    public  Double getLastDeliveryTime (@RequestParam String deliveryPartnerId,@RequestParam String delivery_staus) {
        return orderReposatory.getLastDeliveryTime(deliveryPartnerId,delivery_staus);
    }


    public String deleteOrder(String orderId){
        return orderReposatory.deleteOrder(orderId);
    }
}
