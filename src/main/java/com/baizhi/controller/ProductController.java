package com.baizhi.controller;

import com.baizhi.entity.Product;
import com.baizhi.service.CategoryService;
import com.baizhi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    private ProductService pservice;
    @Autowired
    private CategoryService cservice;

    @RequestMapping("/ByPage")
    public @ResponseBody
    Map selectByPage(int page, int rows) {
        Map map = pservice.selectByPage(page, rows);
        return map;
    }

    //删除
    @RequestMapping("/delete")
    public String delete(int[] ids) {
        pservice.delete(ids);
        return "redirect:/products/queryAllProduct.jsp";
    }

    //添加
    @RequestMapping("/add")
    public String add(Product pro, Map map, int cid) {
        System.out.println(cid);
        System.out.println(pro);
        pro.setCid(cid);
        pservice.add(pro);
        return "redirect:/products/queryAllProduct.jsp";
    }

    //修改
    @RequestMapping("/update")
    public String update(Product pro) {
        System.out.println(pro);
        pservice.update(pro);
        return "redirect:/products/queryAllProduct.jsp";
    }

    @RequestMapping("/selectOne")
    public @ResponseBody
    Map selectOne(int id) {
        Map map = pservice.selectOne(id);
        return map;
    }
}
