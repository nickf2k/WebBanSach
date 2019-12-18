package com.nmcnpm.nhom16.entities;

import java.sql.Date;

public class Orderr {
    private String idOrder;
    private int idCustomer;
    private Date date;
    private String address;
    private String total;

    public Orderr(String idOrder) {
        this.idOrder = idOrder;
    }

    public Orderr(String idOrder, int idCustomer, Date date, String address, String total) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.date = date;
        this.address = address;
        this.total = total;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
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
