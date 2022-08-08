package com.liebe.blogbackend.controller;

import com.liebe.blogbackend.service.account.AccountService;
import com.liebe.blogbackend.utils.ConstMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.liebe.blogbackend.entity.Account;
import org.springframework.web.bind.annotation.ResponseBody;
import com.liebe.blogbackend.common.Result;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    @ResponseBody
    public Result AccountVerification(@RequestBody Account account) {
        List<Account> res = accountService.findByUserName(account);
        Result result = new Result();
        if (res.size() == 0) {
            result.setRes(ConstMsg.failure);
        } else {
            result.setRes(ConstMsg.success);
        }
        return result;
    }

    @RequestMapping("/register")
    @ResponseBody
    public Result AccountRegister(@RequestBody Account account) {
        int success = accountService.addAccount(account);
        Result result = new Result();
        if (success > 0) {
            result.setRes(ConstMsg.success);
        }
        else {
            result.setRes(ConstMsg.failure);
        }
        return result;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String sayHello() {
        return "Hello, Spring Boot";
    }
}
