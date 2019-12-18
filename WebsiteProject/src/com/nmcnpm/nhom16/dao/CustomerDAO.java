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
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery(query);
            while (resultSet.next()) {
                String idCustomer = resultSet.getString(1);
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
    public boolean register(Customer customer) {
        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?)";
        try {
            if (connection == null) {
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getNameCustomer());
            preparedStatement.setString(2, customer.getPhoneNumber());
            preparedStatement.setString(3, customer.getAddress());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getUser());
            preparedStatement.setString(6, customer.getPassword());
            int intRes = preparedStatement.executeUpdate();
            connectionFactory.closeConnection();
            preparedStatement.close();
            if (intRes == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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

    @Override
    public int getIDFromUser(String user) {
        int resultInt = 0;
        String query = "select IdCustomer from Customer where [User] = ?";
        try {
            if (connection == null) {
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resultInt = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInt;
    }

}
