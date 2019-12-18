package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.dao.OrderDAO;
import com.nmcnpm.nhom16.entities.Orderr;

public class OrderService implements IOrderService<Orderr> {
    @Override
    public boolean saveOrder(Orderr orderr) {
        return new OrderDAO().save(orderr);
    }
}
