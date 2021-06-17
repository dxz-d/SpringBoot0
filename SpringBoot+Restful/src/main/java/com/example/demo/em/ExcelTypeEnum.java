package com.example.demo.em;

/**
 * @description: Excel枚举类型
 * @author: dxz
 * @date: 2021/6/17 11:09
 */
public enum  ExcelTypeEnum {

    XLS("xls"), XLSX("xlsx");

    private String value;

    private ExcelTypeEnum(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }
}
