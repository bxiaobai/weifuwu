package com.example.loginserviceone.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commonutils.po.User;
import com.example.loginapi.api.UserService;
import com.example.loginserviceone.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【u_user】的数据库操作Service实现
* @createDate 2023-03-24 14:00:24
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




