package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminService {
    Connection connection;
    PreparedStatement preparedStatement;
    public boolean isAdmin(String user, String password){
        String query = "select * from Admin where UserName = ? and PassWord = ?";
        try {
            if (connection == null) {
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
