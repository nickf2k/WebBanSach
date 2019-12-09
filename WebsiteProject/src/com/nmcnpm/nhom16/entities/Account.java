package com.nmcnpm.nhom16.entities;

public class Account {
    private String user;
    private String password;
    private int idAccount;
    private int idCustomer;

    public Account(int idAccount) {
        this.idAccount = idAccount;
    }

    public Account(String user, String password, int idCustomer) {
        this.user = user;
        this.password = password;
        this.idCustomer = idCustomer;
    }

    public Account(String user, String password, int idAccount, int idCustomer) {
        this.user = user;
        this.password = password;
        this.idAccount = idAccount;
        this.idCustomer = idCustomer;
    }

    public Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
}
