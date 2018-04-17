package com.cmos.core.controller;

import java.util.List;

import com.cmos.domain.User;
import com.cmos.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:01 2018/4/15
 * @Modified By:
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/shows")
    public String testUser(){
        System.out.println("000000000000000000000");
        List<User> all = userService.findAll();
        System.out.println(all);
        return "index";
    }
}
