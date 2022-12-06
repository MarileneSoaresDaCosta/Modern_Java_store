package com.modernjava.store;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreatingOrdersTest {

    @Test
    void createsNewCustomer(){

        List<String> list = Arrays.asList(new String[] {"678 Lafayette Ave", "Suite 2B"});
        Address newAddress = new Address("Mountain View", list, "CA", "USA", "", "698-999-8741", "94043" );
        Customer newCustomer = new Customer("Jon Snow",newAddress, newAddress );
        assertNotNull(newCustomer);
    }
}
