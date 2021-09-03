package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "e_user")
public class EUser {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    private String sex;

    private String money;

    @Column(name = "user_name")
    private String userName;

    private BigDecimal price;

    private Date now;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return money
     */
    public String getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(String money) {
        this.money = money;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return now
     */
    public Date getNow() {
        return now;
    }

    /**
     * @param now
     */
    public void setNow(Date now) {
        this.now = now;
    }
}