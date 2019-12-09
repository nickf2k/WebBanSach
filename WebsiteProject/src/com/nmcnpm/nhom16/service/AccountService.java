package com.nmcnpm.nhom16.service;

import com.nmcnpm.nhom16.dao.AccountDAO;
import com.nmcnpm.nhom16.entities.Account;

public class AccountService implements IAccountService<Account> {
    @Override
    public boolean checkLogin(Account account) {
        return new AccountDAO().checkLogin(account);
//        System.out.println(res);
//        return res;
    }
}
