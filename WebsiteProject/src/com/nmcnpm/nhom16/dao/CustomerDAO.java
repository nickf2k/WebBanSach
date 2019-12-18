package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;
import com.nmcnpm.nhom16.entities.Customer;

import java.sql.*;

public class CustomerDAO implements ICustomerDAO<Customer> {
    PreparedStatement preparedStatement;
    ConnectionFactory connectionFactory;
    Connection connection;

    public CustomerDAO() {
        try {
            connectionFactory = new ConnectionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer getCustomerByID(int id) {
        Customer customer = null;
        String query = "select * from Customer where Customer.IdCustomer = ?";
        try {
            preparedStatement = connectionFactory.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery(query);
            while (resultSet.next()) {
                int idCustomer = resultSet.getInt(1);
                String nameCustomer = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String address = resultSet.getString(4);
                String email = resultSet.getString(5);
                String user = resultSet.getString(6);
                String password = resultSet.getString(7);
                customer = new Customer(idCustomer, nameCustomer, phone, address, email, user, password);
            }
            preparedStatement.close();
            connectionFactory.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;

    }

    @Override
    public String register(Customer customer) {
        return "";
    }

    @Override
    public boolean checkLogin(Customer customer) {
        String query = "select c.[User],c.Pass from Customer as c where c.[User] = ? and c.Pass = ?";

        try {
            if (connection == null) {
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getUser());
            preparedStatement.setString(2, customer.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if (resultSet.next()) {
                return true;
//                System.out.println(resultSet.getString(1));
//                System.out.println(resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
//        Customer customer = new CustomerDAO().getCustomerByID(1);

    }
}
