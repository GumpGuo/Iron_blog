//import com.guo.dao.BlogTypeDao;
//import com.guo.model.BlogType;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * @ClassName： Demo02
// * @author： 98231
// * @create： 2019-01-07 11:32
// * @desc： 测试BlogTypeDao
// **/
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo02 {
//
//    @Autowired
//    BlogTypeDao blogTypeDao;
//
//    @Test
//    public void demo01() {
//        BlogType blogType = new BlogType();
//        blogType.setId(2);
//        blogType.setTypeName("java");
//        blogType.setOrderNum(2);
//
//        blogTypeDao.addBlogType(blogType);
//
//        System.out.println("-------id-------");
//        System.out.println(blogType.getId());
//        BlogType byTypeId = blogTypeDao.findByTypeId(2);
//        System.err.println("-----------------------------------------");
//        System.out.println(blogType.getTypeName());
//
//        List<BlogType> list = blogTypeDao.getAll();
//
//        for (BlogType type : list) {
//            System.out.println(type.getTypeName());
//        }
//
//        System.out.println(blogTypeDao.getCountByBlogType(blogTypeDao.findByTypeId(1)));
//
//
//        blogType.setTypeName("javaScript");
//
//        blogTypeDao.updateBlogType(blogType);
//
//        System.out.println(blogTypeDao.findByTypeId(2).getTypeName());
//
//        blogTypeDao.deleteBlogType(blogType);
//
//    }
//
//    @Test
//    public void demo() {
////        blogTypeDao.getCountByBlogType();
////        blogTypeDao.getAll();
////        blogTypeDao.updateBlogType();
////        blogTypeDao.addBlogType();
////        blogTypeDao.deleteBlogType();
////        blogTypeDao.findByTypeId();
//        BlogType blogType = new BlogType();
//        blogType.setId(2);
//        blogTypeDao.deleteBlogType(blogType);
//    }
//
//    @Test
//    public void demo02() {
//        BlogType blogType = new BlogType();
//        blogType.setTypeName("javaScript");
//        blogType.setOrderNum(2);
//        blogTypeDao.addBlogType(blogType);
//        blogType.setOrderNum(3);
//        System.out.println(blogType.getId());
//
//    }
//}
