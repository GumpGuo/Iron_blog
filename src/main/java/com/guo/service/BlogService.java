package com.guo.service;

import com.guo.model.Blog;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 98231
 * @ClassName： BlogService
 * @create 2019-01-11 21:49
 * @desc
 **/

public interface BlogService {

    /**
     * 增加一篇博客
     */
    Integer addBlog(Blog blog);

    /**
     * 根据id获取博客
     */
    Blog getById(Integer id);

    /**
     * 获取所有博客
     */
    List<Blog> getAll();

    /**
     * 分页获取博客
     */
    List<Blog> listByPage(Map<String,Object> map);

    /**
     * 获取前一篇博客
     */
    Blog getPrevBlog(Date releaseDate);

    /**
     * 获取后一篇博客
     */
    Blog getNextBlog(Date releaseDate);

    List<Blog> listBlog(Map<String,Object> map);

}
