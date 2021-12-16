package com.hieu.springmongojracademy.model;

public class Address {
    private String line1;
    private String line2;
    private String state;
    private int zipCode;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String line1, String line2, String state, int zipCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.state = state;
        this.zipCode = zipCode;
    }
}
