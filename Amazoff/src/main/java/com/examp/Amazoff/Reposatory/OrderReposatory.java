package com.examp.Amazoff.Reposatory;

import com.examp.Amazoff.modelClass.Order;
import org.springframework.stereotype.Repository;

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

}
