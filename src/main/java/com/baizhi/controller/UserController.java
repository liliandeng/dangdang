package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService uservice;

    @RequestMapping("/selectUser")
    public String selectOne(Map map, User us, HttpSession session, String yzm) {
        String s = (String) session.getAttribute("kaptcha");
        if (yzm.equals(s) && map != null) {
            us = uservice.login(us);
            session.setAttribute("user", us);
            System.out.println(us);
            return "redirect:/main/main.jsp";
        } else {
            return null;
        }
    }

    @RequestMapping("/sessions")
    public String removes(HttpSession session) {
        session.removeAttribute("user");
        return "index";
    }
}
