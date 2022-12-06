package com.modernjava.store;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private Address shippingAddress;
    private Address billingAddress;
}
