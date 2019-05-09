package com.guo.dao;

import com.guo.model.Blog;
import com.guo.model.BlogType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 98231
 * @ClassName： BlogDao
 * @create 2019-01-05 22:31
 * @desc 博客Dao层
 **/

@Repository
public interface BlogDao {

    /**
     * 新增一篇博客
     */
    public Integer addBlog(Blog blog);

    /**
     * 删除一篇博客
     */
    public Integer deleteBlog(Blog blog);

    /**
     * 更新一篇博客
     */
    public Integer updateBlog(Blog blog);

    /**
     * 根据id查询对应的博客
     */
    public Blog getById(Integer id);

    /**
     * 同类型上一篇博客
     */
    public Blog getPrevBlog(Date releaseDate);

    /**
     * 同类型下一篇博客
     */
    public Blog getNextBlog(Date releaseDate);


    /**
     * 获得所有博客
     */
    public List<Blog> getAll();


    /**
     * 获得同一类型的所有博客
     */
    public List<Blog> getByTypeId(Integer typeId);


    /**
     * 获得所有博客的数量，以便分页
     */
    public Long getTotalCount();


    /**
     * 分页获取博客
     */
    public List<Blog> listByPage(Map<String,Object> map);


    /**
     * 博客的点击量+1
     */
    public Integer addClickHit(Blog blog);


    /**
     * 根据可变条件，获取博客
     */
    public List<Blog> listBlog(Map<String,Object> map);
}











