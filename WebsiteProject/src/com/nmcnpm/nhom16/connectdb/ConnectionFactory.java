package com.nmcnpm.nhom16.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection;
    public static final String MSSQL_URL = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String  DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=ShellBook";
    public static final String USER = "sa";
    public static final String PASSWORD = "sa";
    public static ConnectionFactory getInstance()throws Exception{
        return new ConnectionFactory();
    }

    public ConnectionFactory() throws Exception {
        Class.forName(MSSQL_URL);
        connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
    }

    public Connection getConnection(){
        return connection;
    }
    public void closeConnection()throws Exception{
        if(connection !=null)
            connection.close();
    }
}
