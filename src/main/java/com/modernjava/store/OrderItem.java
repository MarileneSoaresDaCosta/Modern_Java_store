package com.modernjava.store;

import java.math.BigDecimal;

public class OrderItem {
    private int quantity;
    private BigDecimal discount;
    private Product product;

    public OrderItem(int quantity, BigDecimal discount, Product product) {
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", discount=" + discount +
                ", product=" + product +
                '}';
    }
}
