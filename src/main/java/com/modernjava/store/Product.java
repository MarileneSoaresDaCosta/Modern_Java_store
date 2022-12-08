package com.modernjava.store;

import lombok.*;

import java.math.BigDecimal;

//@Data
//@AllArgsConstructor
@ToString
@Getter
@Builder
public class Product {
    private String name;
    private String description;
    private String sku;
    private BigDecimal price;


}
