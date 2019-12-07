package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.entities.Customer;

import java.sql.*;

public class CustomerDAO implements ICustomerDAO<Customer> {
    Statement statement;
    Connection connection;
    @Override
    public Customer getCustomerByID(int id) {
        Customer customer = null;
        String query = "select * from Customer where Customer.IdCustomer = "+ id;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int idCustomer = resultSet.getInt(1);
                String nameCustomer  = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String address = resultSet.getString(4);
                String email = resultSet.getString(5);
                customer = new Customer(idCustomer,nameCustomer,phone,address,email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;

    }

    @Override
    public boolean register(Customer customer) {
        return true;
    }
}
