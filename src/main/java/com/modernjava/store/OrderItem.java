package com.modernjava.store;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderItem {
    private int quantity;
    private BigDecimal discount;
    private Product product;

}
