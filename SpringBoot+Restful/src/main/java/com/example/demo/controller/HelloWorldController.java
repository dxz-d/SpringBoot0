package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/3 14:55
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World!";
    }
}
