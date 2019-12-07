package com.nmcnpm.nhom16.entities;

import java.sql.Date;

public class Book {
    private int idBook;
    private int idCategory;
    private int idAuthor;
    private int idPublisher;
    private String nameBook;
    private String description;
    private String price;
    private Date yearPublished;
    private String imageURL;

    public Book(int idBook, int idCategory, int idAuthor, int idPublisher, String nameBook, String description, String price, Date yearPublished, String imageURL) {
        this.idBook = idBook;
        this.idCategory = idCategory;
        this.idAuthor = idAuthor;
        this.idPublisher = idPublisher;
        this.nameBook = nameBook;
        this.description = description;
        this.price = price;
        this.yearPublished = yearPublished;
        this.imageURL = imageURL;
    }

    public Book() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Date yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "--" + idBook +
                "--" + idCategory +
                "--" + idAuthor +
                "--" + idPublisher +
                "--" + nameBook +
                "--" + description +
                "--" + price +
                "--" + yearPublished +
                "--" + imageURL;

    }
}
