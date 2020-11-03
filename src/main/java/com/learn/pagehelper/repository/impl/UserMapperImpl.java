package com.learn.pagehelper.repository.impl;

import com.github.pagehelper.PageHelper;
import com.learn.pagehelper.entity.User;
import com.learn.pagehelper.repository.UserMapper;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapperImpl  {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return (List<User>) userMapper.findAll();
    }

    public List<User> findById(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return (List<User>) userMapper.findAll();
    }
}
