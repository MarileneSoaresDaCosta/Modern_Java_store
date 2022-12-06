package com.modernjava.store;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String name;
    private String description;
    private String sku;
    private BigDecimal price;


}
