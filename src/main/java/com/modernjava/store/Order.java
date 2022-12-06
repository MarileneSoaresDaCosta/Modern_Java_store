package com.modernjava.store;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private Address altShippingAddress;
    private List<OrderItem> items;
    private Customer customer;
}
