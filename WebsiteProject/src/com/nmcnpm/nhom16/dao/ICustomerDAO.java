package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.entities.Customer;

public interface ICustomerDAO<T> {
    T getCustomerByID(int id);
    boolean register(T t);

    boolean checkLogin(T t);
}
