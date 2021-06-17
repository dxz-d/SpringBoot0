package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @description:
 * @author: dxz
 * @date: 2021/6/17 10:40
 */

@Data
@TableName(value = "e_user")
public class UserDomain {

    private Integer userId;

    private Integer sex;

    private BigDecimal money;

    private String userName;

    private Float price;

    private Date now;
}
