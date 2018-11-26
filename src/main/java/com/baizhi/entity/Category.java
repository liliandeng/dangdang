package com.baizhi.entity;

public class Category {
    private int cid;
    private int pid;
    private String cname;
    private int count;
    private int ctype;


    public Category() {
    }

    public Category(int cid, int pid, String cname, int count, int ctype) {
        this.cid = cid;
        this.pid = pid;
        this.cname = cname;
        this.count = count;
        this.ctype = ctype;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", pid=" + pid +
                ", cname='" + cname + '\'' +
                ", count=" + count +
                ", ctype=" + ctype +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCtype() {
        return ctype;
    }

    public void setCtype(int ctype) {
        this.ctype = ctype;
    }
}
