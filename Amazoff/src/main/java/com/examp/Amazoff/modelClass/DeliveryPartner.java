package com.examp.Amazoff.modelClass;

public class DeliveryPartner {

    private String delivery_status;
    private String name;
    private String contact;
    public DeliveryPartner(String delivery_status, String name, String contact) {
        this.delivery_status = delivery_status;
        this.name = name;
        this.contact = contact;
    }
    public String getDelivery_status() {
        return delivery_status;
    }
    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }


}


