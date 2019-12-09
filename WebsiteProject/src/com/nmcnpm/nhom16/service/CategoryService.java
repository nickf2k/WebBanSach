package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.dao.CategoryDAO;
import com.nmcnpm.nhom16.entities.Category;

import java.util.List;

public class CategoryService implements ICategoryService<Category> {
    @Override
    public List<Category> getAllCategory() {
        return new CategoryDAO().getAllCategory();
    }

    @Override
    public Category getCategoryByID(int id) {
        return new CategoryDAO().getCategoryByID(id);
    }
}
