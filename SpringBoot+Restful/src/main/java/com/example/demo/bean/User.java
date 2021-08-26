package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/3 15:19
 */
@Data
public class User implements Serializable {
    /**
     * 编号
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
}
