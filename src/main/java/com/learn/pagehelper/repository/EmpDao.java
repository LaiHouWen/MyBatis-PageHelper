package com.learn.pagehelper.repository;

import com.learn.pagehelper.entity.Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface EmpDao {

    @Select(value = "select empno,ename,job,sal,mgr,comm,deptno from emp")
    List<Emp> findAllEmp();

}
