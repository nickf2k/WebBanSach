package com.nmcnpm.nhom16.dao;

import java.util.List;

public interface ICategoryDAO<T>{
    List<T> getAllCategory();
    T getCategoryByID(int id);
}
