package com.learn.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learn.pagehelper.repository")
public class LearnMybatisPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisPagehelperApplication.class, args);
    }

}
