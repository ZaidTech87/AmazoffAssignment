package com.examp.Amazoff.modelClass;

public class Order {

    private String orderId;
    private String delivery_time;
    private String delivery_status;
    private String deliveryPartnerId;
    public Order(){ }
    public Order(String orderId, String delivery_time, String delivery_status, String deliveryPartnerId) {
        this.orderId = orderId;
        this.delivery_time = delivery_time;
        this.delivery_status = delivery_status;
        this.deliveryPartnerId = deliveryPartnerId;
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
    public String getDeliveryPartnerId() {
        return deliveryPartnerId;
    }
    public void setDeliveryPartnerId(String deliveryPartnerId) {
        this.deliveryPartnerId = deliveryPartnerId;
    }
}
