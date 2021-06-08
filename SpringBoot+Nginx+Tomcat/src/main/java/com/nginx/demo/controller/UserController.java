package com.nginx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/7 11:47
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/username", method = {RequestMethod.GET, RequestMethod.POST})
    public User username() {
        // 假装请求了数据库
        User user = new User("www");
        return user;
    }

    class User {
        private String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
