package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.entities.Book;

import java.util.List;

public interface IBookService<T> {
    public List<T> getAllBook();
    public Book getBookByID(int id);
}
