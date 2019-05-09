import com.guo.dao.BlogDao;
import com.guo.model.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName： Demo01
 * @author： 98231
 * @create： 2019-01-06 22:46
 * @desc： 测试blogDao
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class Demo01 {

//    @Autowired
//    private BlogDao blogDao;
//
//    @Test
//    public void demo01() {
//        Blog blog = blogDao.findById(1);
//        System.out.println(blog);
//
//        blog.setTitle("测试2");
//
//        blogDao.addBlog(blog);
//
//        Blog blog1 = blogDao.findById(37);
//
//        System.out.println(blog1);
//        blog1.setTitle("测试3");
//        blogDao.updateBlog(blog1);
//
////        blogDao.deleteBlog(blog1);
//
//
//        Date date = new Date(System.currentTimeMillis());
//        Date date2 = new Date(System.currentTimeMillis()-30*60*1000);
//        System.out.println(blogDao.getPrevBlog(date));
//
//        System.out.println("————————————————nextBlog————————————————————————");
//
//        System.out.println(blogDao.getNextBlog(date2));
//
//        List<Blog> list = blogDao.getAll();
//        for (Blog blog2 : list) {
//            System.out.println(blog2);
//        }
//
//        System.out.println(blogDao.getAll());
//        Map<String,Object> map = new HashMap<String, Object>();
//
//        List<Blog> list1 = blogDao.listByPage(map);
//
//        for (Blog blog2 : list1) {
//            System.out.println(blog2);
//        }
//
//    }
//
//    @Test
//    public void demo() {
////        blogDao.getNextBlog();
////        blogDao.getPrevBlog();
////        blogDao.getAll();
////        blogDao.getTotalCount();
////        blogDao.listByPage();
//    }
}
