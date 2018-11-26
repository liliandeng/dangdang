package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private int id;
    private String email;
    private String nickname;//昵称
    private String pass;
    private Date time;//时间
    private String state;//装态
    private String authority;//管理员

    public User() {
        super();
    }

    public User(int id, String email, String nickname, String pass, Date time, String state, String authority) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.pass = pass;
        this.time = time;
        this.state = state;
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pass='" + pass + '\'' +
                ", time=" + time +
                ", state='" + state + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
