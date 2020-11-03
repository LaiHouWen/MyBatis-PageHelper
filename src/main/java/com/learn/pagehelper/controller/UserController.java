package com.learn.pagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.learn.pagehelper.entity.PageModel;
import com.learn.pagehelper.entity.User;
import com.learn.pagehelper.repository.impl.UserMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 分页查询
 */
@RestController
public class UserController {

    @Autowired
    private UserMapperImpl userMapperImpl;

    @GetMapping("/findAll")
    public List<User> findAllUser(){
        return userMapperImpl.findAll();
    }

    @GetMapping("/findById/{num}/{size}")
    public PageModel<List<User>> findById(@PathVariable("num") int num,
                              @PathVariable("size") int size){
        List<User> list = userMapperImpl.findById(num,size);
        PageModel<List<User>> pageModel = new PageModel<>();
        pageModel.setCode(200);
        pageModel.setMessage("success");
        pageModel.setTimeStamp("2020-06-10");
        pageModel.setData(list);
        return pageModel;
    }

}
