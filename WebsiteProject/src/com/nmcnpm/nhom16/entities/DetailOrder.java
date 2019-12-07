package com.nmcnpm.nhom16.entities;

public class DetailOrder {
    private int idDetailOrder;
    private int idBook;
    private int idOrder;

    public DetailOrder(int idDetailOrder, int idBook, int idOrder) {
        this.idDetailOrder = idDetailOrder;
        this.idBook = idBook;
        this.idOrder = idOrder;
    }

    public DetailOrder() {
    }

    public int getIdDetailOrder() {
        return idDetailOrder;
    }

    public void setIdDetailOrder(int idDetailOrder) {
        this.idDetailOrder = idDetailOrder;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
}
