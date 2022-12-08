package com.modernjava.store;

import lombok.*;

//@Data
//@AllArgsConstructor
@ToString
@Getter
@Builder
public class Customer {
    private String name;
    private Address shippingAddress;
    private Address billingAddress;
}
