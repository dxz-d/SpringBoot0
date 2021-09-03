package com.example.demo.bean;

import javax.persistence.*;

public class Person {
    @Id
    private String name;

    private String username;

    @Column(name = "phoneNumber")
    private Integer phonenumber;

    @Column(name = "imageUrl")
    private String imageurl;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return phoneNumber
     */
    public Integer getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber
     */
    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return imageUrl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * @param imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}