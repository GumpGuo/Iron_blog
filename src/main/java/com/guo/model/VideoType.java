package com.guo.model;

/**
 * @ClassName： VideoType
 * @author： 98231
 * @create： 2019-01-05 22:27
 * @desc： 视频种类
 **/
public class VideoType {
    /**
     * 种类id
     */
    private Integer id;

    /**
     * 种类名称
     */
    private String typeName;

    /**
     * 优先级
     */
    private Integer orderNum;


    /**
     * 视频总数
     */
    private Integer videoCount;


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

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }
}
