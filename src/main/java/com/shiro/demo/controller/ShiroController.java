package com.shiro.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiroController {
//https://www.cnblogs.com/WUXIAOCHANG/p/10886534.html
	
	/**
     * 测试方法
     */
    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        System.out.println("UserController.hello()");
        return "ok";
    }
}
