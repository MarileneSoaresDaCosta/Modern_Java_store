package com.modernjava.store;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Address altShippingAddress;
    private List<OrderItem> items;
    private Customer customer;
}
