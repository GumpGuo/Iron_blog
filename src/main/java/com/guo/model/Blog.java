package com.guo.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName： Blog
 * @author： 98231
 * @create： 2018-12-30 14:01
 * @desc： 博客
 **/
public class Blog {
    /**
     * 博客id
     */
    private Integer id ;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客作者
     */
    private String author;

    /**
     * 博客简介
     */
    private String summary;

    /**
     * 博客发布日期
     */
    private Date releaseDate;

    /**
     * 点击数
     */
    private Integer clickHit;

    /**
     * 正文内容
     */
    private String content;

    /**
     * 关键字
     */
    private String keyWord;

    /**
     * 博客类型
     */
    private BlogType blogType;

    /**
     * 正文内容包含的图片地址
     */
    private List<String> imageList = new LinkedList<String>();




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getClickHit() {
        return clickHit;
    }

    public void setClickHit(Integer clickHit) {
        this.clickHit = clickHit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public BlogType getBlogType() {
        return blogType;
    }

    public void setBlogType(BlogType blogType) {
        this.blogType = blogType;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {



        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", releaseDate=" + releaseDate +
                ", clickHit=" + clickHit +
                ", content='" + content + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", blogType=" + blogType +
                ", imageList=" + imageList +
                '}';
    }
}
