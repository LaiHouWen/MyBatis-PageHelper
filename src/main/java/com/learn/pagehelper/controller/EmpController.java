package com.learn.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.pagehelper.entity.Emp;
import com.learn.pagehelper.repository.EmpDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Resource
    private EmpDao empDao;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getList(){
        return "list1.html";
    }


    @RequestMapping(value = "/emp/findallemp",method = RequestMethod.GET)
    public String findAllEmp(ModelMap modelMap, @RequestParam(defaultValue = "0",value = "pageNum") int pageNum,
                          @RequestParam(defaultValue = "sal",value = "type") String type){

//        PageHelper.startPage(pageNum,5);
        //第三个参数：按字段排序
        PageHelper.startPage(pageNum,5,type+" desc");
        List<Emp> emps = empDao.findAllEmp();

        PageInfo<Emp> pages = new PageInfo<>(emps);

        System.out.println("当前页数："+pages.getPageNum());

        System.out.println("总页数："+pages.getPages());

        System.out.println("总数量："+pages.getTotal());

        System.out.println("所有数据："+pages.getList());

        System.out.println("是否有上一页："+pages.isHasPreviousPage());

        System.out.println("是否有下一页："+pages.isHasNextPage());

        System.out.println("当前页的上一页："+(pages.isHasPreviousPage()?pages.getPrePage():"0"));

        System.out.println("当前页的下一页："+(pages.isHasNextPage()?pages.getNextPage():pages.getPages()-1));

        modelMap.addAttribute("pages",pages);
        return "/list1.html";
    }

    @ResponseBody
    @RequestMapping(value = "/emp/findallemps",method = RequestMethod.GET)
    public PageInfo<Emp> findAllEmps(@RequestParam(defaultValue = "0",value = "pageNum") int pageNum,
                             @RequestParam("type") String type){

        if (StringUtils.isEmpty(type)){
            PageHelper.startPage(pageNum,5);}
        //第三个参数：按字段排序
        else {
            PageHelper.startPage(pageNum,5,type);//desc asc
        }
        List<Emp> emps = empDao.findAllEmp();

        PageInfo<Emp> pages = new PageInfo<>(emps);

        System.out.println("当前页数："+pages.getPageNum());

        System.out.println("总页数："+pages.getPages());

        System.out.println("总数量："+pages.getTotal());

        System.out.println("所有数据："+pages.getList());

        System.out.println("是否有上一页："+pages.isHasPreviousPage());

        System.out.println("是否有下一页："+pages.isHasNextPage());

        System.out.println("当前页的上一页："+(pages.isHasPreviousPage()?pages.getPrePage():"0"));

        System.out.println("当前页的下一页："+(pages.isHasNextPage()?pages.getNextPage():pages.getPages()-1));

        return pages;
    }
}
