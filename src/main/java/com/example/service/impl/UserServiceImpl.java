package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.SysUser;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2006-2010, ChengDu ybyainfo. Co., Ltd.
 * FileName: UserServiceImpl.java
 *
 * @version 1.00
 * @Author lt
 * @Date 2019/6/19 9:45
 **/
@Service
public class UserServiceImpl implements UserService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;
    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
