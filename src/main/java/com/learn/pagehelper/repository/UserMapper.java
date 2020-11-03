package com.learn.pagehelper.repository;

import com.learn.pagehelper.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface UserMapper {

    public Collection<User> findAll();
}
