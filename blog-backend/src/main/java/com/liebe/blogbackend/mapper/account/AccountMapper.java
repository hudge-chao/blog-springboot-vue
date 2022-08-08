package com.liebe.blogbackend.mapper.account;

import com.liebe.blogbackend.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    public List<Account> findByUserName(Account account);

    public int addAccount(Account account);
}
