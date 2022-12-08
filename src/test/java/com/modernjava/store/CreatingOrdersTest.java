package com.modernjava.store;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreatingOrdersTest {
    List<Product> products = new ArrayList<>();

    // create a customer with addresses
    List<String> listShipping = Arrays.asList("3401 Hillview Ave.");

    /* classic constructor:
       Address newShippingAddress = new Address("Palo Alto", listShipping, "CA", "USA", null, "698-999-8741", "94304" );
       List<String> listBilling = Arrays.asList("380 Interlocken Crescent", "Suite 500");
       Address newBillingAddress = new Address("Broomfield", listBilling, "CO", "USA", null, "303-942-4600", "80021" );
       Customer newCustomer = new Customer("VMware",newShippingAddress, newBillingAddress );
    */

    Address newShippingAddress = Address.builder()
            .locality("Palo Alto")
            .addressLines(listShipping)
            .administrativeArea("CA")
            .postalCountry("USA")
            .primaryPhoneNumber("698-999-8741")
            .postalCode("94304")
            .build();

    List<String> listBilling = Arrays.asList("380 Interlocken Crescent", "Suite 500");
    Address newBillingAddress = Address.builder()
            .locality("Broomfield")
            .addressLines(listBilling)
            .administrativeArea("CO")
            .postalCountry("USA")
            .primaryPhoneNumber("303-942-4600")
            .postalCode("80021")
            .build();

    Customer newCustomer = Customer.builder()
        .name("VMware")
        .shippingAddress(newShippingAddress)
        .billingAddress(newBillingAddress)
        .build();

    @BeforeEach
    void setUp(){
        // creates a list of products
        String[] productNames = {"warp drive", "tractor beam", "phaser", "universal translator", "tricorder", "bat'leth", "cloaking device", "holodeck","positronic brain", "photon torpedo" };
        for(int i = 0; i < 10; i++) {
            Product newProduct = Product.builder()
                    .name(productNames[i])
                    .description("fictitious stuff")
                    .sku("I000"+((i+5)*13))
                    .price(BigDecimal.valueOf( ( 15.99 * ((i+1) + 11) ) ) )
                    .build();
            products.add(newProduct);
        }
    }

    // testing classes' constructors
    @Test
    void createsNewCustomer(){
        List<String> list = Arrays.asList("678 Lafayette Ave", "Suite 2B");
        Address newShippingAddress = Address.builder()
                .locality("Kirkwood")
                .addressLines(listShipping)
                .administrativeArea("CA")
                .postalCountry("USA")
                .primaryPhoneNumber("698-999-8741")
                .postalCode("94304")
                .build();


        List<String> listBilling = Arrays.asList("380 Interlocken Crescent", "Suite 500");
        Address newBillingAddress = Address.builder()
                .locality("Broomfield")
                .addressLines(listBilling)
                .administrativeArea("CO")
                .postalCountry("USA")
                .primaryPhoneNumber("303-942-4600")
                .postalCode("80021")
                .build();


        Customer newCustomer = Customer.builder()
                .name("VMware")
                .shippingAddress(newShippingAddress)
                .billingAddress(newBillingAddress)
                .build();

        System.out.println("New customer: " + newCustomer.toString());

        assertNotNull(newCustomer.toString());
    }

    @Test
    void createsNewProduct() {
        /* classic style
        Product newProduct = new Product("replicator", "stuff that makes other stuff", "I0012345", BigDecimal.valueOf(15.99));
        */
        Product newProduct = Product.builder()
                .name("replicator")
                .description("stuff that makes other stuff")
                .sku("I0012345")
                .price(BigDecimal.valueOf(15.99))
                .build();

        System.out.println("New product: " +newProduct.toString());
        assertNotNull(newProduct.toString());
    }

    @Test
    void createsOrder() {
        List<OrderItem> items = new ArrayList<>();
        for (Product product : products) {
            Random rand = new Random();
            int randomQuantity = rand.nextInt(10) + 1;
            double randomDiscount = rand.nextDouble(.3);
            BigDecimal discount = product.getPrice().multiply(BigDecimal.valueOf(randomDiscount));
            /* Classic:
              OrderItem newItem = new OrderItem(randomQuantity, discount, product) ;
             */
            OrderItem newItem = OrderItem.builder()
                    .quantity(randomQuantity)
                    .discount(discount)
                    .product(product)
                    .build();

            items.add(newItem);
        };

        /* classic:
            Order newOrder = new Order(newCustomer.getShippingAddress(), items, newCustomer);
         */
        Order newOrder = Order.builder()
                .altShippingAddress(newCustomer.getShippingAddress())
                .items(items)
                .customer(newCustomer)
                .build();

        System.out.println("Customer name: " + newOrder.getCustomer().getName()
                + " total Order Cost: " + newOrder.getTotalCost() );
        int itemsInOrder = newOrder.getItems().size();
        assertEquals(10, itemsInOrder);
    }



}
