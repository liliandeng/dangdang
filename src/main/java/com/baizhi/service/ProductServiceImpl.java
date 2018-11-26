package com.baizhi.service;

import com.baizhi.dao.ProductDao;
import com.baizhi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Map selectByPage(int page, int rows) {
        int start = (page - 1) * rows;
        int end = page * rows;
        int count = productDao.selectCount();
        List<Product> list = productDao.selectAllByPage(start, end);
        Map map = new HashMap();

        map.put("rows", list);
        map.put("total", count);
        return map;

    }

    @Override
    public void delete(int[] ids) {
        productDao.delete(ids);
    }

    @Override
    public void add(Product pro) {
        productDao.add(pro);
    }

    @Override
    public void update(Product pro) {
        productDao.update(pro);
    }

    @Override
    public Map selectOne(int id) {
        Map map = new HashMap();
        Product p = new Product();
        p = productDao.selectOne(id);
        map.put("pro", p);
        return map;
    }
}
