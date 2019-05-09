package com.guo.service.impl;

import com.guo.dao.BlogDao;
import com.guo.model.Blog;
import com.guo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName： BlogServiceImpl
 * @author： 98231
 * @create： 2019-01-11 21:52
 * @desc： 博客服务类
 **/
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogDao blogDao;

    /**
     * 增加一篇博客
     */
    public Integer addBlog(Blog blog) {
        return blogDao.addBlog(blog);
    }

    /**
     * 根据id获取 博客
     */
    public Blog getById(Integer id) {
        return blogDao.getById(id);
    }

    /**
     * 列出所有博客
     */
    public List<Blog> getAll() {
        return blogDao.getAll();
    }

    /**
     * 列出对应页数的博客
     */
    public List<Blog> listByPage(Map<String, Object> map) {
        return blogDao.listByPage(map);
    }

    public Blog getPrevBlog(Date releaseDate) {
        return blogDao.getPrevBlog(releaseDate);
    }

    public Blog getNextBlog(Date releaseDate) {
        return blogDao.getNextBlog(releaseDate);
    }

    public List<Blog> listBlog(Map<String, Object> map) {
        return blogDao.listBlog(map);
    }


}
