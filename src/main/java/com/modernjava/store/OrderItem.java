package com.modernjava.store;

import lombok.*;

import java.math.BigDecimal;

//@Data
//@AllArgsConstructor
@ToString
@Getter
@Builder
public class OrderItem {
    private int quantity;
    private BigDecimal discount;
    private Product product;

}
