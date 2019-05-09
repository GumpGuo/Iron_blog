//import com.guo.model.Blog;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//import java.util.Date;
//
///**
// * @ClassName： Demo_Date
// * @author： 98231
// * @create： 2019-01-09 10:26
// * @desc： 测试时间类
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo_Date {
//    @Resource
//    BlogService blogService;
//
//    @Test
//    public void demo() {
//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);
//    }
//
//    @Test
//    public void demo01() {
//        Blog blog = blogService.findById(1);
//        System.out.println(blog.getBlogType());
//
//    }
//
//    @Test
//    public void name() {
//        Blog blog =blogService.findById(1);
//        System.out.println(blog.getClickHit());
//        blogService.addClickHit(blog);
//        System.out.println(blog.getClickHit());
//    }
//}
