package com.nmcnpm.nhom16.entities;

import java.sql.Date;

public class Orderr {
    private int idOrder;
    private int idCustomer;
    private Date date;
    private String address;
    private String total;

    public Orderr(int idOrder) {
        this.idOrder = idOrder;
    }

    public Orderr(int idOrder, int idCustomer, Date date, String address, String total) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.date = date;
        this.address = address;
        this.total = total;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
