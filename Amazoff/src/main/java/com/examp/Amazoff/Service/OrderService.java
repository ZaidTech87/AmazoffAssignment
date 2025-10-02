package com.examp.Amazoff.Service;

import com.examp.Amazoff.Reposatory.OrderReposatory;
import com.examp.Amazoff.modelClass.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrderService {
    @Autowired
    OrderReposatory orderReposatory;
    public String addOrder(Order order){
        String  response = orderReposatory.addOrder(order);
        return response;

    }
}
