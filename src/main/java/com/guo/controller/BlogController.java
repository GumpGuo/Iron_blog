package com.guo.controller;

import com.guo.model.Blog;
import com.guo.model.BlogType;
import com.guo.service.BlogService;
import com.guo.service.BlogTypeService;
import com.guo.utils.DateUtil;
import com.guo.utils.ModelViewUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName： BlogController
 * @author： 98231
 * @create： 2019-01-11 21:50
 * @desc：
 **/

@Controller
@RequestMapping("/blog")
public class BlogController {


    @Autowired
    BlogService blogService;

    @Autowired
    BlogTypeService blogTypeService;
    @RequestMapping("category")
    public ModelAndView blogcategory() {
        ModelAndView modelAndView = new ModelAndView();

        List<Blog> blogList = blogService.getAll();


        modelAndView.addObject("blogList", blogList);
        modelAndView.setViewName("blog");
        return modelAndView;
    }

    @RequestMapping("/archive/{nowpage}")
    public ModelAndView archives(@PathVariable("nowpage") Integer nowPage,
                                 @RequestParam(value = "typeId", required = false) Integer typeId,
                                 @RequestParam(value = "author",required = false) String author) {
        ModelAndView modelAndView = new ModelAndView();
        int blogCount = blogService.getAll().size();
        int pageSize = 5;
        Map<String, Object> map = new HashMap<String, Object>();
        int totalPage = (int) Math.ceil(blogCount * 1.0 / pageSize);

//        String typeIdValue = request.getParameter("typeId");
        //添加分页信息
        map.put("start", (nowPage - 1) * pageSize);
        map.put("pageSize", pageSize);

//        if (typeIdValue != null) {
//            Integer typeId = Integer.valueOf(typeIdValue);
//            map.put("typeId", typeId);
//            modelAndView.addObject("typeId", typeId);
//        }
        System.out.println(null != typeId);
        if (typeId != null) {
            map.put("typeId", typeId);
            System.out.println(typeId);
            modelAndView.addObject("typeId", typeId);
        }

        if (author != null) {
            map.put("author",author);
            modelAndView.addObject("author",author);
        }

        //要显示的博客
        List<Blog> archiveList = blogService.listByPage(map);
        modelAndView.addObject("archiveList", archiveList);
        modelAndView.addObject("totalPage", totalPage);


        modelAndView.setViewName("archive");
        return modelAndView;
    }

    @RequestMapping("/articles/{id}")
    public ModelAndView articleInt(@PathVariable("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();

        Blog blog = blogService.getById(id);

        Date date = blog.getReleaseDate();

        Blog prevBlog = blogService.getPrevBlog(date);
        Blog nextBlog = blogService.getNextBlog(date);

        String releaseDate = DateUtil.formatDate(blog.getReleaseDate(), "yyyy-MM-dd");

        modelAndView.addObject("prevBlog", prevBlog);
        modelAndView.addObject("nextBlog", nextBlog);
        modelAndView.addObject("releaseDate", releaseDate);
        modelAndView.addObject("blog", blog);

        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping("/author/{authorName}")
    public ModelAndView authorArticle(@PathVariable("authorName") String authorName){
        ModelAndView modelAndView = new ModelAndView();

        List<BlogType> blogTypeList = blogTypeService.getAuthorData(authorName);


        modelAndView.addObject("blogTypeList",blogTypeList);
        modelAndView.addObject("authorName",authorName);

        modelAndView.setViewName("author");
        return modelAndView;
    }

    @RequestMapping("/author/{authorName}/{typeId}")
    public ModelAndView authorArticleDetail(@PathVariable("authorName")String authorName,
                                            @PathVariable("typeId")Integer typeId){
        ModelAndView modelAndView = new ModelAndView();

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("authorName",authorName);
        map.put("typeId",typeId);


        List<Blog> blogList = blogService.listBlog(map);



        modelAndView.addObject(blogList);
        modelAndView.addObject(authorName);
        modelAndView.addObject(typeId);

        modelAndView.setViewName("/jsp/author/type");
        return  modelAndView;
    }

}




