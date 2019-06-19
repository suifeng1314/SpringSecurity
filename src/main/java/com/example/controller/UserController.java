package com.example.controller;

import com.example.entity.SysUser;
import com.example.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 个人中心
     */
    @PreAuthorize("hasAuthority('UserIndex')")
    @GetMapping("/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        SysUser sysUser = userService.getUserByName("zhangsan");
        return sysUser.toString();
    }

    public static void main(String[] args) {
        String pwd = "123456";
        String encodePwd = BCrypt.hashpw(pwd, BCrypt.gensalt()); // 加密，核心代码
        System.out.println(encodePwd);
    }

}
