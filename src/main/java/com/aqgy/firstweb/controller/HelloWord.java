package com.aqgy.firstweb.controller;

import com.aqgy.firstweb.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloWord {
    @Autowired
    HelloWordService helloWordService;
    @ResponseBody
    @RequestMapping("/hello")
    public String  getWorld(){
        helloWordService.hello();
        return "World";
    }


    @RequestMapping("/msg")
    public String getMapToView(Map<String,Object> map){
        map.put("mesaage","这里是方言");
        map.put("user", Arrays.asList("张三","里斯","王二麻子"));
        return "login";

    }
   /* @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/
}
