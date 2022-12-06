package com.modernjava.store;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private Address shippingAddress;
    private Address billingAddress;
}
