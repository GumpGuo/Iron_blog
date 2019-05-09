package com.guo.dao;

import com.guo.model.Link;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 98231
 * @ClassName： LinkDao
 * @create 2019-01-05 22:32
 * @desc
 **/
@Repository
public interface LinkDao {
    /**
     * 增加一个链接
     */
    public Integer addLink(Link link);

    /**
     * 删除一个链接
     */
    public Integer deleteLink(Link link);

    /**
     * 更新一个链接
     */
    public Integer updateLink(Link link);

    /**
     * 根据id查询一个Link
     */
    public Link getById(Integer id);

    /**
     * 获取所有的链接
     */
    public List<Link> getAll();

    /**
     * 获取所有链接的数量
     */
    public Long getTotalCount();

}
