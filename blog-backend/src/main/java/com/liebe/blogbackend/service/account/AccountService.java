package com.liebe.blogbackend.service.account;

import com.liebe.blogbackend.entity.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findByUserName(Account account);

    public int addAccount(Account account);
}
