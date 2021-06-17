package com.example.demo.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @description:
 * @author: dxz
 * @date: 2021/6/10 16:57
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class PersonExportVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Name
     */
    @Excel(name = "name", orderNum = "0", width = 15)
    private String name;

    /**
     * Login Username
     */
    @Excel(name = "User Name", orderNum = "1", width = 15)
    private String username;

    @Excel(name = "mobile phone number", orderNum = "2", width = 15)
    private String phoneNumber;

    /**
     * Face picture
     */
    @Excel(name = "face picture", orderNum = "3", width = 15, height = 30, type = 2)
    private String imageUrl;

}
