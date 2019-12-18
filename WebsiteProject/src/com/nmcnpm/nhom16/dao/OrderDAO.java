package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;
import com.nmcnpm.nhom16.entities.Orderr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderDAO implements IOrderDAO<Orderr> {
    Connection connection;
    PreparedStatement preparedStatement;

    @Override
    public boolean save(Orderr orderr) {
        String query = "INSERT INTO Orderr VALUES(?,?,?,?,? );";
        try {
            if (connection == null) {
                connection = ConnectionFactory.getInstance().getConnection();
                System.out.println("make connection in checkLogin");
            }
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, orderr.getIdCustomer());
            preparedStatement.setString(2, orderr.getIdOrder());
            preparedStatement.setDate(3, orderr.getDate());
            preparedStatement.setString(4, orderr.getAddress());
            preparedStatement.setString(5, orderr.getTotal());
            int resultInt = preparedStatement.executeUpdate();
            if (resultInt == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
