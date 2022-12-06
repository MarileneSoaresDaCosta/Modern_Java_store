package com.modernjava.store;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String description;
    private String sku;
    private BigDecimal price;


}
