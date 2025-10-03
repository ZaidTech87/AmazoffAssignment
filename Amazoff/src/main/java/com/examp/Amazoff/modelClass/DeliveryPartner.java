package com.examp.Amazoff.modelClass;

public class DeliveryPartner {

    private String deliveryPartnerId;
    private String name;
    private String contact;

    // ✅ Default constructor (needed by Jackson)
    public DeliveryPartner() {
    }

    public DeliveryPartner(String deliveryPartnerId, String name, String contact) {
        this.deliveryPartnerId = deliveryPartnerId;
        this.name = name;
        this.contact = contact;
    }

    public String getDeliveryPartnerId() {
        return deliveryPartnerId;
    }
    public void setDeliveryPartnerId(String deliveryPartnerId) {
        this.deliveryPartnerId = deliveryPartnerId;
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
