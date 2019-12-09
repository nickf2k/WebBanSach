package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;
import com.nmcnpm.nhom16.entities.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO implements IAccountDAO<Account>{
    Connection connection;
    PreparedStatement statement;

    public AccountDAO() {
        if (connection == null) {
            try {
                connection = ConnectionFactory.getInstance().getConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean checkLogin(Account account) {
        String query = "select a.[User],a.Pass from Account as a where a.[User] = ? and a.Pass = ?" ;
        try {
            if (connection==null){
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
             statement = connection.prepareStatement(query);
             statement.setString(1,account.getUser());
             statement.setString(2, account.getPassword());
            ResultSet  resultSet = statement.executeQuery();
            System.out.println(resultSet);
            if (resultSet.next()){
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
        boolean re = new AccountDAO().checkLogin(new Account("nghia","12345"));
        System.out.println(re);
    }
}
