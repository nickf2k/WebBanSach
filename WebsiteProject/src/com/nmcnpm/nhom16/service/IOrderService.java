package com.nmcnpm.nhom16.service;

public interface IOrderService<T> {
    boolean saveOrder(T t);
}
