package com.modernjava.store;

import java.util.List;

public class Address {
    private String locality;
    private List<String> addressLines;
    private String administrativeArea;
    private String postalCountry;
    private String dependantLocality;
    private String primaryPhoneNumber;
    private String postalCode;

    public Address(String locality, List<String> addressLines, String administrativeArea, String postalCountry, String dependantLocality, String primaryPhoneNumber, String postalCode) {
        this.locality = locality;
        this.addressLines = addressLines;
        this.administrativeArea = administrativeArea;
        this.postalCountry = postalCountry;
        this.dependantLocality = dependantLocality;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.postalCode = postalCode;
    }

    public Address(List<String> addressLines, String postalCode) {
        this.addressLines = addressLines;
        this.postalCode = postalCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public List<String> getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getPostalCountry() {
        return postalCountry;
    }

    public void setPostalCountry(String postalCountry) {
        this.postalCountry = postalCountry;
    }

    public String getDependantLocality() {
        return dependantLocality;
    }

    public void setDependantLocality(String dependantLocality) {
        this.dependantLocality = dependantLocality;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "locality='" + locality + '\'' +
                ", addressLines=" + addressLines +
                ", administrativeArea='" + administrativeArea + '\'' +
                ", postalCountry='" + postalCountry + '\'' +
                ", dependantLocality='" + dependantLocality + '\'' +
                ", primaryPhoneNumber='" + primaryPhoneNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
