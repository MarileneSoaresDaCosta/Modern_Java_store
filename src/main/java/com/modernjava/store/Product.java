package com.modernjava.store;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String description;
    private String sku;
    private BigDecimal price;

    public Product(String name, String description, String sku, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.sku = sku;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }
}
