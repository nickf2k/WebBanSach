package com.nmcnpm.nhom16.dao;

public interface IOrderDAO<T> {
    boolean save(T t);
}
