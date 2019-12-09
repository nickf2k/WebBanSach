package com.nmcnpm.nhom16.dao;

public interface IAccountDAO<T>{
    boolean checkLogin(T t);
}
