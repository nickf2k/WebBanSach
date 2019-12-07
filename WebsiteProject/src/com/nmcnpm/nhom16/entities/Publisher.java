package com.nmcnpm.nhom16.entities;

public class Publisher {
    private int idPublisher;
    private String namePublisher;

    public Publisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    public Publisher(int idPublisher, String namePublisher) {
        this.idPublisher = idPublisher;
        this.namePublisher = namePublisher;
    }

    public int getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }
}
