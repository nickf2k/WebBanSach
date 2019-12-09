package com.nmcnpm.nhom16.service;

import java.util.List;

public interface ICategoryService<T> {
    List<T> getAllCategory();
    T getCategoryByID(int id);
}
