package com.baizhi.service;


import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Map selectAll() {
        List<Category> list = categoryDao.selectAll();
        Map map = new HashMap();
        map.put("list", list);
        return map;
    }
}
