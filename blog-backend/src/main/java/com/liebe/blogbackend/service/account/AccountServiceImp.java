package com.liebe.blogbackend.service.account;

import com.liebe.blogbackend.entity.Account;
import com.liebe.blogbackend.mapper.account.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public List<Account> findByUserName(Account account){
        List<Account> res = accountMapper.findByUserName(account);
        return res;
    }

    public int addAccount(Account account) {
        int res = accountMapper.addAccount(account);
        return res;
    }
}
