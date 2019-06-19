package com.example.service;

import com.example.entity.SysUser;

/**
 * Copyright (C), 2006-2010, ChengDu ybyainfo. Co., Ltd.
 * FileName: UserService.java
 *
 * @version 1.00
 * @Author lt
 * @Date 2019/6/19 9:38
 **/
public interface UserService {
    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);
}
