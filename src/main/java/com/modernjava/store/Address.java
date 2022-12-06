package com.modernjava.store;

import lombok.Data;

import java.util.List;


@Data
public class Address {
    private String locality;
    private List<String> addressLines;
    private String administrativeArea;
    private String postalCountry;
    private String dependantLocality;
    private String primaryPhoneNumber;
    private String postalCode;

}
