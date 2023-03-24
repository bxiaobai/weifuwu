package com.example.loginserviceone.controller;


import com.example.commonutils.utils.CommonResult;
import com.example.loginapi.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    /**
     * 登录请求
     * @param name 姓名
     * @param password 密码
     * @return 0代表失败，1代表正确
     */
    @GetMapping("/user")
    public CommonResult login(@RequestParam("name") String name , @RequestParam("password") String password){
        return userService.login(name,password);
    }

}
