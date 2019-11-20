package com.javakc.ssm.user.controller;

import com.javakc.ssm.user.entity.User;
import com.javakc.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //表现层的东西
    @RequestMapping("insert")
    public String insert(User user){
        userService.insert(user);
        return null;
    }

}
