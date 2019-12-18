package com.nmcnpm.nhom16.dao;

import com.nmcnpm.nhom16.entities.Orderr;

public class OrderDAO implements IOrderDAO<Orderr> {
    @Override
    public boolean save(Orderr orderr) {
        return true;
    }
}
