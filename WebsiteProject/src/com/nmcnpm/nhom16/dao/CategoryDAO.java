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
        if (connection == null && statement == null) {
            try {
                connection = ConnectionFactory.getInstance().getConnection();
                statement = connection.createStatement();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categoryList = new ArrayList<>();
        String query = "select * from dbo.Book";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int idCategory = resultSet.getInt(1);
                String nameCategory = resultSet.getString(2);
                categoryList.add(new Category(idCategory,nameCategory));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public Category getCategoryByID(int id) {
        Category category = null;
        String query = "select * from Book where Book.IdBook = "+ id;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int idCategory = resultSet.getInt(1);
                String nameCategory = resultSet.getString(2);
                category = new Category(idCategory, nameCategory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
}
