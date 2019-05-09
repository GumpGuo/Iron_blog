package com.guo.service;

import com.guo.model.BlogType;

import java.util.List;

/**
 * @author 98231
 * @ClassName： BlogTypeService
 * @create 2019-01-14 15:20
 * @desc 博客类处理类
 **/
public interface BlogTypeService {

    List<BlogType> getAuthorData(String authorName);
}
