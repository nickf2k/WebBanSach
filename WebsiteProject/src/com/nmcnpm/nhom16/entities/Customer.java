package com.nmcnpm.nhom16.entities;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String phoneNumber;
    private String address;
    private String email;

    public Customer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Customer(int idCustomer, String nameCustomer, String phoneNumber, String address, String email) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
