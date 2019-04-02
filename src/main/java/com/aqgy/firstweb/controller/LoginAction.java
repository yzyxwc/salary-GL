package com.aqgy.firstweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginAction {
    @PostMapping(value = "/user/login")
    public  String loginCheck(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123".equals(password)){
            session.setAttribute("name",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","账户或密码输入不正确");
            return "login";
        }

    }
}
