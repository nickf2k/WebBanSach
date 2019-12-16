package com.nmcnpm.nhom16.dao;

public interface ICustomerDAO<T> {
    T getCustomerByID(int id);
    String register(T t);
}
