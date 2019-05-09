package com.guo.dao;

import com.guo.model.BlogType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName： BlogTypeDao
 * @author： 98231
 * @create： 2019-01-05 22:31
 * @desc： 博客类Dao层
 **/
@Repository
public interface BlogTypeDao {
    /**
     * 增加一个博客种类
     */
    public Integer addBlogType(BlogType blogType);

    /**
     * 删除一个博客种类
     */
    public Integer deleteBlogType(BlogType blogType);

    /**
     * 更新一个博客的种类
     */
    public Integer updateBlogType(BlogType blogType);

    /**
     * 根据id查询博客的种类
     */
    public BlogType getById(Integer id);

    /**
     * 获得所有的博客种类
     */
    public List<BlogType> getAll();

    /**
     * 获得博客种类的具体信息，包括了某种类别博客的数量
     */
    public List<BlogType> getBlogTypeData();


    /**
     * 获得某种博客种类总数量，便于分页
     */
    public Long getCountById(Integer id);


    /**
     * 根据作者名称，获得作者的博客种类数量，便于分页
     */
    public List<BlogType> getCountByAuthor(String authorName);
}
