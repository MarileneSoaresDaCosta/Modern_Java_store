package com.modernjava.store;

import java.util.List;

public class Order {
    private Address altShippingAddress;
    private List<OrderItem> items;
    private Customer customer;

    public Order(Address altShippingAddress, List<OrderItem> items, Customer customer) {
        this.altShippingAddress = altShippingAddress;
        this.items = items;
        this.customer = customer;
    }

    public Address getAltShippingAddress() {
        return altShippingAddress;
    }

    public void setAltShippingAddress(Address altShippingAddress) {
        this.altShippingAddress = altShippingAddress;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "altShippingAddress=" + altShippingAddress +
                ", items=" + items +
                ", customer=" + customer +
                '}';
    }
}
