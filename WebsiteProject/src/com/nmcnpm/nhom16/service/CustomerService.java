package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.dao.CustomerDAO;
import com.nmcnpm.nhom16.entities.Customer;

public class CustomerService implements ICustomerService<Customer> {
    @Override
    public boolean register(Customer customer) {
        return new CustomerDAO().register(customer);
    }

    @Override
    public Customer getCustomerByID(int id) {
        return new CustomerDAO().getCustomerByID(id);
    }

    @Override
    public boolean checkLogin(Customer customer) {
        return new CustomerDAO().checkLogin(customer);
    }

    @Override
    public int getIDFromUser(String user) {
        return new CustomerDAO().getIDFromUser(user);
    }
}
