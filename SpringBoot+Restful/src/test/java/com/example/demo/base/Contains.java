package com.example.demo.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @description:
 * @author: dxz
 * @date: 2021/7/4 0:06
 */
public class Contains {

    @Test
    void contextLoads() {
        String str = "abc";
        boolean status = str.contains("a");
        System.out.println("status:" +status);
        if(status){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
    }

    @Test
    void dxzIf() {
        // 构造hashmap
        HashMap newmap = new HashMap();

        // 给hashmap赋值
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(3, "is best");

        System.out.println("Values before remove: "+ newmap);

        // 移除key为2的value
        newmap.remove(2);

        System.out.println("Values after remove: "+ newmap);
    }
}
