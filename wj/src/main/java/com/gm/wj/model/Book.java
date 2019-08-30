package com.gm.wj.model;

import java.io.Serializable;
/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 8625847741120835120L;

    private int id;
    private String cover;
    private String title;
    private String author;
    private String createDate;
    private String press;
    private String abs;
    private int cid;
    /**
     * Category名称
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
