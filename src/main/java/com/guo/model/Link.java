package com.guo.model;

/**
 * @ClassName： Link
 * @author： 98231
 * @create： 2019-01-05 22:09
 * @desc： 链接
 **/
public class Link {
    /**
     * 链接id
     */
    private Integer id;
    /**
     * 链接名称
     */
    private String linkName;
    /**
     * 链接地址
     */
    private String linkUrl;

    /**
     * 链接优先级
     */
    private Integer orderNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
