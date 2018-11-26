package com.baizhi.service;

import com.baizhi.entity.Product;

import java.util.Map;

public interface ProductService {

    public Map selectByPage(int page, int rows);

    //删除
    public void delete(int[] ids);

    //添加
    public void add(Product pro);

    //修改
    public void update(Product pro);

    public Map selectOne(int id);
}
