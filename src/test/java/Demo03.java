//import com.guo.dao.LinkDao;
//import com.guo.model.Link;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * @ClassName： Demo03
// * @author： 98231
// * @create： 2019-01-07 12:35
// * @desc： 测试LinkDao
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo03 {
//
//    @Autowired
//    LinkDao linkDao;
//
//    @Test
//    public void demo01() {
//        Link link = new Link();
//        link.setOrderNum(1);
//        link.setLinkName("百度");
//        link.setLinkUrl("http://www.baidu.com");
//        linkDao.addLink(link);
//
//        link = linkDao.findById(1);
//
//        System.out.println(link.getLinkName());
//
//
//        link.setLinkName("百度+++++");
//        linkDao.updateLink(link);
//
//        Link link1 = new Link();
//        link1.setLinkName("百度2号");
//        link1.setLinkUrl("http://www.baidu.com");
//        link1.setOrderNum(1);
//
//        linkDao.addLink(link1);
//        System.out.println(linkDao.getTotalCount());
//
//        System.out.println(link1.getId());
//
//        System.out.println("delete-----------------------------");
//
//        linkDao.deleteLink(link1);
//
//        List<Link> links = linkDao.getAll();
//
//        for (Link link2 : links) {
//            System.out.println(link2.getLinkName());
//        }
//    }
//
//    @Test
//    public void demo() {
//
////        linkDao.getAll();
////        linkDao.updateLink();
////        linkDao.addLink();
////        linkDao.deleteLink();
////        linkDao.findById();
////        linkDao.getTotalCount();
//
//    }
//}
