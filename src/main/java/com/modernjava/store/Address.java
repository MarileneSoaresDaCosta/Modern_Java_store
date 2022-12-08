package com.modernjava.store;

import lombok.*;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Getter
@Builder
public class Address {
    private String locality;
    private List<String> addressLines;
    private String administrativeArea;
    private String postalCountry;
    private String dependantLocality;
    private String primaryPhoneNumber;
    private String postalCode;

}
