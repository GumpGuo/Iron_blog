package com.guo.model;

/**
 * @ClassName： BlogType
 * @author： 98231
 * @create： 2019-01-05 22:06
 * @desc： 博客类型，用于博客的归类
 **/
public class BlogType {
    /**
     * 博客类型id
     */
    private Integer id;

    /**
     *  博客类型 名称
     */
    private String typeName;
    /**
     * 优先级
     */
    private Integer orderNum;
    /**
     * 博客总数
     */
    private Integer blogCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getBlogCount() {
        return blogCount;
    }

    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }
}
