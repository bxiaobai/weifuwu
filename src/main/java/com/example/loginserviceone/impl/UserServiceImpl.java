package com.example.loginserviceone.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commonutils.po.User;
import com.example.commonutils.utils.CommonResult;
import com.example.loginapi.api.UserService;
import com.example.loginserviceone.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.UUID;

/**
* @author Administrator
* @description 针对表【u_user】的数据库操作Service实现
* @createDate 2023-03-24 14:00:24
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    UserMapper userMapper;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public CommonResult login(String name, String password) {

        log.info("登录请求进行中..........................");
        User user = query().eq("name", name).one();


        if (user == null){
            throw new RuntimeException("账号不存在!");
        }


        if (!user.getPassword().equals(password)){
            throw new RuntimeException("密码错误!");
        }

        log.info("登录验证结束，登录成功..........................");


        return CommonResult.success(user);
    }
}




