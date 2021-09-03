package com.example.demo.bean;


import com.example.demo.service.UserService;
import com.example.demo.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/30 11:57
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    @Autowired
    private UserService userService;

    // redis中存储的过期时间60s
    private static int ExpireTime = 60 * 60 * 12;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("findKey")
    public Object findKey(String key) {

        // 先从缓存redis读取列表
        String redisKey = key;
        Object obj = redisUtil.get(redisKey);

        log.info("redis生成的key值为: {}", redisKey);
        if (null != obj) {
            return obj;
        }

        // 将列表数据set入redis,过期时间一天
        boolean redisBl = redisUtil.set(redisKey, obj, 3600 * 24);
        //return redisUtil.set(key,userEntity,ExpireTime);

        return obj;
    }


    @RequestMapping("findKey1")
    public User findKey1(String userName) {
        // 先从缓存redis读取列表
        String redisKey = userName;
        Object obj = redisUtil.get(redisKey);

        log.info("redis生成的key值为: {}", redisKey);
        if (null != obj) {
            return (User) obj;
        }

        // 将列表数据set入redis,过期时间一天
        boolean redisBl = redisUtil.set(redisKey, obj, 3600 * 24);
        //return redisUtil.set(key,userEntity,ExpireTime);

        return userService.findUserByName(userName);
    }

    @RequestMapping("get")
    public Object redisget(String key) {
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key) {
        return redisUtil.expire(key, ExpireTime);
    }
}

