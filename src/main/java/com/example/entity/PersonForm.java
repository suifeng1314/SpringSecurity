package com.example.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class PersonForm {
    private int id;
    @NotEmpty(message = "用户不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码长度不能少于六位")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
