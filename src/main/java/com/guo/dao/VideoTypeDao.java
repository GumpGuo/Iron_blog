package com.guo.dao;

import com.guo.model.VideoType;
import org.springframework.stereotype.Repository;

/**
 * @author 98231
 * @ClassName： VideoTypeDao
 * @create 2019-01-05 22:33
 * @desc
 **/
@Repository
public interface VideoTypeDao {
    /**
     * 增加视频种类
     */
    public Integer addVideoType(VideoType videoType);

    /**
     * 删除一个视频种类
     */
    public Integer deleteVideoType(VideoType videoType);

    /**
     * 更新视频种类
     */
    public Integer updateVideoType(VideoType videoType);

    /**
     * 根据id查询对应的视频类
     */
    public VideoType getById(Integer id);

    /**
     * 获得视频分类的总个数
     */
    public Long getCount();
}
