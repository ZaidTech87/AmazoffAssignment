package com.examp.Amazoff.modelClass;

public class Order {

    private String orderId;
    private String delivery_time;
    private String delivery_status;
    public Order(String orderId, String delivery_time, String delivery_status) {
        this.orderId = orderId;
        this.delivery_time = delivery_time;
        this.delivery_status = delivery_status;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getDelivery_time() {
        return delivery_time;
    }
    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }
    public String getDelivery_status() {
        return delivery_status;
    }
    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }
}
