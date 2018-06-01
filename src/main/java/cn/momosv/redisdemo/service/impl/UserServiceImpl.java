package cn.momosv.redisdemo.service.impl;

import cn.momosv.redisdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String set(String key) {
        System.out.println("momo");
        return "ss+"+new Date().toString();
    }

    @Override
    public String get(String key) {
        return "momoa121";
    }
}
