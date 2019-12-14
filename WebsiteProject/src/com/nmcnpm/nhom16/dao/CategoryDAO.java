package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;
import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.entities.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDAO<Category> {
    Statement statement;
    Connection connection;

    public CategoryDAO() {
        try {
            connection = ConnectionFactory.getInstance().getConnection();
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categoryList = new ArrayList<>();
        String query = "select * from dbo.Category";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int idCategory = resultSet.getInt(1);
                String nameCategory = resultSet.getString(2);
                categoryList.add(new Category(idCategory, nameCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public Category getCategoryByID(int id) {
        Category category = null;
      String query = "select * from Category where Category.IdCategory = " + id;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int idCategory = resultSet.getInt(1);
                String nameCategory = resultSet.getString(2);
                category = new Category(idCategory, nameCategory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }

    public static void main(String[] args) {
        System.out.println(new CategoryDAO().getCategoryByID(1));
    }
}
