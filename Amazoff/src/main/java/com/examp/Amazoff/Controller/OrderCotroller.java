package com.examp.Amazoff.Controller;

import com.examp.Amazoff.Service.OrderService;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import com.examp.Amazoff.modelClass.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/orderController")
  public class OrderCotroller {
    @Autowired
    OrderService orderService;
    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Order order) {
        String responce = orderService.addOrder(order);
        return responce;
    }
 @PutMapping("/assignOrder{deliveryPartnerId}/{orderId}")
    public String assignOrdertoDeliveryParter(@PathVariable String deliveryPartnerId, @PathVariable String orderId) {
        String response = orderService.assignOrdertoDeliveryParter(deliveryPartnerId,orderId);
        return response;

    }

    @GetMapping("/getOrderbyId")
    public Order getOrderbyId(@RequestParam String orderId) {
        Order order = orderService.getOrderbyId(orderId);
        return order;

    }

    @GetMapping("getOrderAssignByDeliveryPartner")
    public int getOrderAssignByDeliveryPartner(@RequestParam String deliveryPartnerId) {

//        List<String>responce = orderService.getOrderAssignByDeliveryPartner(deliveryPartnerId);
//
        return  orderService.getOrderAssignByDeliveryPartner(deliveryPartnerId);

    }

    @GetMapping("/listAllOrder")
    public List<Order> listAllOrder() {
        return orderService.listAllOrder();

    }
    @GetMapping("/undeliverdOrders")
    public List<Order> getUndeliverdOrders(@RequestParam String deliveryPartnerId,@RequestParam String delivery_staus) {
        return orderService.getUndeliverdOrders(deliveryPartnerId,delivery_staus);
    }
@GetMapping("/lastDeliveryTime")
    public Double getLastDeliveryTime(@RequestParam String deliveryPartnerId,@RequestParam String delivery_staus) {
        return orderService.getLastDeliveryTime(deliveryPartnerId,delivery_staus);
}
@DeleteMapping("/deleteOrder")
    public String deleteOrder(@RequestParam String orderId) {
        return orderService.deleteOrder(orderId);
}
}
