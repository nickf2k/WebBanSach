package com.nmcnpm.nhom16.connectdb;

import java.sql.*;

public class TestConnectDB {
    public static void main(String[] args) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; databaseName=ShellBook";
            String user ="sa";
            String password = "sa";
            Connection conn = DriverManager.getConnection(url,user,password);
            if (conn != null){
                Statement st = conn.createStatement();
                String sql = "select * from dbo.Customer";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    System.out.println(rs.getString("NameCustomer"));
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }
