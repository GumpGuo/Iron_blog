package com.guo.service.impl;

import com.guo.dao.BlogTypeDao;
import com.guo.model.BlogType;
import com.guo.service.BlogService;
import com.guo.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName： BlogTypeServiceImpl
 * @author： 98231
 * @create： 2019-01-14 15:21
 * @desc： 博客类 逻辑层
 **/

@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

    @Autowired
    private BlogTypeDao blogTypeDao;

    public List<BlogType> getAuthorData(String authorName){
        return blogTypeDao.getCountByAuthor(authorName);
    }
}
