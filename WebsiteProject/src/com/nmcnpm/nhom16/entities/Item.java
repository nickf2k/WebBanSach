package com.nmcnpm.nhom16.entities;

import java.io.Serializable;

public class Item implements Serializable {
//    private int id;
    private Book book;
    private int quantity;
//    private String price;
    public Item(){
        super();
    }

//    public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
}
