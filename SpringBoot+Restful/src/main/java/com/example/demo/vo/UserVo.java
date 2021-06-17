package com.example.demo.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/17 10:51
 */
@Data
public class UserVo {

    private static final long serialVersionUID = -1509488199440369183L;

    @Excel(name = "用户id", orderNum = "0", width = 15)
    private String userId;

    @Excel(name = "性别", orderNum = "1", width = 15, replace = {"男_1", "女_1"}, suffix = "孩")
    private String sex;

    @Excel(name = "金钱", orderNum = "2", width = 15)
    private String money;

    @Excel(name = "用户信息", orderNum = "3", width = 15)
    private String userName;

    @Excel(name = "价格", orderNum = "4", width = 15)
    private String price;

    @Excel(name = "时间", orderNum = "5", width = 15, format = "yyyy-MM-dd")
    private Date now;
}
