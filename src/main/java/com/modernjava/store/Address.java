package com.modernjava.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String locality;
    private List<String> addressLines;
    private String administrativeArea;
    private String postalCountry;
    private String dependantLocality;
    private String primaryPhoneNumber;
    private String postalCode;

}
