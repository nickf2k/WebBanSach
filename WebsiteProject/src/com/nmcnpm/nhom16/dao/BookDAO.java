package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.connectdb.ConnectionFactory;
import com.nmcnpm.nhom16.entities.Book;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements IBookDao<Book> {
    Statement statement;
    Connection connection;

    public BookDAO() {
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
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        String query = "select * from dbo.Book";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int idBook = resultSet.getInt(1);
                int idCategory = resultSet.getInt(2);
                int idAuthor = resultSet.getInt(3);
                int idPublisher = resultSet.getInt(4);
                String nameBook = resultSet.getString(5);
                String description = resultSet.getString(6);
                String price = resultSet.getString(7);
                Date date = resultSet.getDate(8);
                String imageURL = resultSet.getString(9);
                bookList.add(new Book(idBook,idCategory,idAuthor,idPublisher,nameBook,description,price,date,imageURL));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public Book getBookByID(int id) {
        Book book = null;
        String query = "select * from Book where Book.IdBook = "+ id;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int idBook = resultSet.getInt(1);
                int idCategory = resultSet.getInt(2);
                int idAuthor = resultSet.getInt(3);
                int idPublisher = resultSet.getInt(4);
                String nameBook = resultSet.getString(5);
                String description = resultSet.getString(6);
                String price = resultSet.getString(7);
                Date date = resultSet.getDate(8);
                String imageURL = resultSet.getString(9);
                book = new Book(idBook,idCategory,idAuthor,idPublisher,nameBook,description,price,date,imageURL);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    public static void main(String[] args) {
//        List<Book> listBooks = new BookDAO().getAllBooks();
//        listBooks.forEach(book -> System.out.println(book));
        System.out.println(new BookDAO().getBookByID(1));
    }
}
