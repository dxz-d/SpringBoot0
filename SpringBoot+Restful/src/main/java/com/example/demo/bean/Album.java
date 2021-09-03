package com.example.demo.bean;

import java.util.Date;
import javax.persistence.*;

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    private String score;

    private String detail;

    private String broadcast;

    private String cover;

    private String author;

    private Integer count;

    @Column(name = "createDate")
    private Date createdate;

    private String chapter;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return broadcast
     */
    public String getBroadcast() {
        return broadcast;
    }

    /**
     * @param broadcast
     */
    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    /**
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return chapter
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * @param chapter
     */
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
}