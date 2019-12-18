package com.nmcnpm.nhom16.dao;

import java.util.List;

public interface IBookDao<T> {
    List<T> getAllBooks();
    T getBookByID(int id);
    public List<T> getBooksByIDCategory(int id);
}
