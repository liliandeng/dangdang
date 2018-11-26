package com.baizhi.entity;

import lombok.Data;

@Data//lombok中的注解,会自动添加无参,有参构造,自动生成get set 方法,equls,hashcode这些方法
public class Menu {
    private int mid;


    private String mname;
    private String resourceurl;
    private int pid;
    private int lev;


}
