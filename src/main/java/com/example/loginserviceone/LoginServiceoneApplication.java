package com.example.loginserviceone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.loginserviceone.mapper")
public class LoginServiceoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginServiceoneApplication.class, args);
    }

}
