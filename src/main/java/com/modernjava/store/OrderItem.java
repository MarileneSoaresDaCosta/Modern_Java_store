package com.modernjava.store;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItem {
    private int quantity;
    private BigDecimal discount;
    private Product product;

}
