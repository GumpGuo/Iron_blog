package com.guo.dao;

import com.guo.model.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 98231
 * @ClassName： VideoDao
 * @create 2019-01-05 22:32
 * @desc
 **/
@Repository
public interface VideoDao {

    /**
     * 增加一个视频
     */
    public Integer addVideo(Video video);

    /**
     * 删除一个视频
     */
    public Integer deleteVideo(Video video);

    /**
     * 更新一个视频
     */
    public Integer updateVideo(Video video);

    /**
     * 根据id查询相应的视频
     */
    public Video getById(Integer id);


    /**
     * 根据视频分类获得所有视频
     */
    public List<Video> findByVideoType(Integer typeId);


    /**
     * 获取所有的视频
     */
    public List<Video> findAll();

    /**
     * 获得视频的总数量
     */
    public Long getCount();
}
