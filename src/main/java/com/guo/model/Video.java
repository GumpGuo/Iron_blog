package com.guo.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName： Video
 * @author： 98231
 * @create： 2019-01-05 21:59
 * @desc： 视频。
 **/
public class Video {

    /**
     * 视频的id
     */
    private Integer id;

    /**
     * 视频的标题
     */
    private String title;

    /**
     * 视频的时长，单位秒
     */
    private Integer timeLength;

    /**
     * 视频种类
     */
    private VideoType videoType;

    /**
     * 视频图片的地址
     */
    private List<String> imgList = new LinkedList<String>();

    /**
     * 视频的地址
     */
    private String url;


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

    public Integer getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(Integer timeLength) {
        this.timeLength = timeLength;
    }

    public List<String> getImgList() {
        return imgList;
    }

    public void setImgList(List<String> imgList) {
        this.imgList = imgList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoType getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoType videoType) {
        this.videoType = videoType;
    }
}
