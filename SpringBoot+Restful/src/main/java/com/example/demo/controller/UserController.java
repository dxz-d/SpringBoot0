package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.UserDomain;
import com.example.demo.rusult.Result;
import com.example.demo.rusult.ResultUtil;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/17 15:13
 */
@RestController
@Slf4j
@Api(tags = "用户接口")
public class UserController {


    @Autowired
    private UserService userService;


    @ApiOperation("新增用户")
    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {
        log.info("user:{}", user);
        boolean b = userService.addUser(user);
        if (b == false) {
            return ResultUtil.define(500, "服务器内部错误", user);
        }
        return ResultUtil.define(200, "添加用户成功", user);
    }

    @ApiOperation("根据用户名和年龄获取用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "age", value = "年龄", dataType = "int", paramType = "query", required = true)
    })
    @GetMapping("/getUserByNameAndAge")
    public Result getUserByNameAndAge(@RequestParam String name, @RequestParam int age) {
        log.info("name:{}, age:{}", name, age);
        User userByNameAndAge = userService.getUserByNameAndAge(name, age);
        if (userByNameAndAge == null) {
            return ResultUtil.define(500, "查询用户失败", userByNameAndAge);
        }
        return ResultUtil.define(200, "查询用户成功", userByNameAndAge);
    }
}
