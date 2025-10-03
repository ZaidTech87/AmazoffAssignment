package com.examp.Amazoff.Controller;

import com.examp.Amazoff.Service.OrderService;
import com.examp.Amazoff.modelClass.DeliveryPartner;
import com.examp.Amazoff.modelClass.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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



}
