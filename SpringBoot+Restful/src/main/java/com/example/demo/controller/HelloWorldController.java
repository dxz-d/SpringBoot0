package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/3 14:55
 */
@Api(tags = "hello接口", hidden = true)
@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World!";
    }
}
