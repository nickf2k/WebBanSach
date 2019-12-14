package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.dao.BookDAO;
import com.nmcnpm.nhom16.entities.Book;

import java.util.List;

public class BookService implements IBookService<Book> {
    @Override
    public List<Book> getAllBook() {
        return new BookDAO().getAllBooks();
    }

    @Override
    public Book getBookByID(int id) {
        return new BookDAO().getBookByID(id);
    }


    @Override
    public List<Book> getBooksByCategoryID(int id) {
        return new BookDAO().getBooksByIDCategory(id);
    }

}
