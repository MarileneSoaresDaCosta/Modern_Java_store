package com.modernjava.store;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

//@Data
//@AllArgsConstructor
@ToString
@Getter
@Builder
public class Order {
    private Address altShippingAddress;
    private List<OrderItem> items;
    private Customer customer;

    public BigDecimal getTotalCost(){
        BigDecimal result = BigDecimal.valueOf(0);
        // for item in items, calc cost
        List<OrderItem> items = this.items;
        for(OrderItem item : items) {
//            System.out.println("price: " + item.getProduct().getPrice() + " discount: " + item.getDiscount());
           BigDecimal finalPrice = item.getProduct().getPrice().subtract(item.getDiscount());
           result = result.add(finalPrice);
//            System.out.println("result: " + result);
        }
        return result;
    }
}
