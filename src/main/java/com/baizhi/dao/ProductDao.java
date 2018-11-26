package com.baizhi.dao;

import com.baizhi.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    public List<Product> selectAllByPage(@Param("start") int start, @Param("end") int end);

    //统计
    public int selectCount();

    //添加
    public void add(Product pro);

    //删除
    public void delete(int[] ids);

    //修改
    public void update(Product pro);

    //查询一个
    public Product selectOne(int id);

}
