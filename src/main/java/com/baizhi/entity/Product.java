package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private int id;
    private int cid;
    private String name;
    private double price;
    private Date btime;
    private String bstate;
    private int inventory;//库存
    private String author;
    private String press;
    private int num;
    private Date ptime;
    private int pcount;
    private String isbn;
    private String wcount;
    private String pagecount;
    private String style;
    private String pages;
    private String pack;
    private int salenum;
    private double cscore;
    private String recommend;
    private String messages;
    private String authormsg;
    private String lists;
    private String mediacommend;
    private String imgpath;//图片uuid名
    private String seriesname;
    private double dprice;//当当价
    private String productimg;//图片原始名
    private Category cate;//多对一查询

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", btime=" + btime +
                ", bstate='" + bstate + '\'' +
                ", inventory=" + inventory +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", num=" + num +
                ", ptime=" + ptime +
                ", pcount=" + pcount +
                ", isbn='" + isbn + '\'' +
                ", wcount='" + wcount + '\'' +
                ", pagecount='" + pagecount + '\'' +
                ", style='" + style + '\'' +
                ", pages='" + pages + '\'' +
                ", pack='" + pack + '\'' +
                ", salenum=" + salenum +
                ", cscore=" + cscore +
                ", recommend='" + recommend + '\'' +
                ", messages='" + messages + '\'' +
                ", authormsg='" + authormsg + '\'' +
                ", lists='" + lists + '\'' +
                ", mediacommend='" + mediacommend + '\'' +
                ", imgpath='" + imgpath + '\'' +
                ", seriesname='" + seriesname + '\'' +
                ", dprice=" + dprice +
                ", productimg='" + productimg + '\'' +
                ", cate=" + cate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public String getBstate() {
        return bstate;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public int getPcount() {
        return pcount;
    }

    public void setPcount(int pcount) {
        this.pcount = pcount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getWcount() {
        return wcount;
    }

    public void setWcount(String wcount) {
        this.wcount = wcount;
    }

    public String getPagecount() {
        return pagecount;
    }

    public void setPagecount(String pagecount) {
        this.pagecount = pagecount;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public int getSalenum() {
        return salenum;
    }

    public void setSalenum(int salenum) {
        this.salenum = salenum;
    }

    public double getCscore() {
        return cscore;
    }

    public void setCscore(double cscore) {
        this.cscore = cscore;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getAuthormsg() {
        return authormsg;
    }

    public void setAuthormsg(String authormsg) {
        this.authormsg = authormsg;
    }

    public String getLists() {
        return lists;
    }

    public void setLists(String lists) {
        this.lists = lists;
    }

    public String getMediacommend() {
        return mediacommend;
    }

    public void setMediacommend(String mediacommend) {
        this.mediacommend = mediacommend;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
    }

    public double getDprice() {
        return dprice;
    }

    public void setDprice(double dprice) {
        this.dprice = dprice;
    }

    public String getProductimg() {
        return productimg;
    }

    public void setProductimg(String productimg) {
        this.productimg = productimg;
    }

    public Category getCate() {
        return cate;
    }

    public void setCate(Category cate) {
        this.cate = cate;
    }

    public Product(int id, int cid, String name, double price, Date btime, String bstate, int inventory, String author, String press, int num, Date ptime, int pcount, String isbn, String wcount, String pagecount, String style, String pages, String pack, int salenum, double cscore, String recommend, String messages, String authormsg, String lists, String mediacommend, String imgpath, String seriesname, double dprice, String productimg, Category cate) {
        this.id = id;
        this.cid = cid;
        this.name = name;
        this.price = price;
        this.btime = btime;
        this.bstate = bstate;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.num = num;
        this.ptime = ptime;
        this.pcount = pcount;
        this.isbn = isbn;
        this.wcount = wcount;
        this.pagecount = pagecount;
        this.style = style;
        this.pages = pages;
        this.pack = pack;
        this.salenum = salenum;
        this.cscore = cscore;
        this.recommend = recommend;
        this.messages = messages;
        this.authormsg = authormsg;
        this.lists = lists;
        this.mediacommend = mediacommend;
        this.imgpath = imgpath;
        this.seriesname = seriesname;
        this.dprice = dprice;
        this.productimg = productimg;
        this.cate = cate;
    }
}
