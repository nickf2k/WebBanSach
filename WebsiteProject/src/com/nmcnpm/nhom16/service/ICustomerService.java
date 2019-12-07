package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.entities.Customer;

public interface ICustomerService<T> {
    boolean register(T t);
    T getCustomerByID(int id);
}
