//import com.guo.dao.VideoTypeDao;
//import com.guo.model.VideoType;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * @ClassName： Demo06
// * @author： 98231
// * @create： 2019-01-07 15:51
// * @desc： 测试VideoTypeDao
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo06 {
//    @Autowired
//    VideoTypeDao videoTypeDao;
//
//
//    @Test
//    public void demo01() {
//        VideoType videoType = new VideoType();
//        videoType.setTypeName("分类1");
//        videoType.setOrderNum(0);
//
//        System.out.println("---------addVideoType----------");
//        videoTypeDao.addVideoType(videoType);
//
//        System.out.println("---------getCount---------");
//        System.out.println(videoTypeDao.getCount());
//
//        System.out.println("----------findVideoTypeById----------");
//        System.out.println(videoTypeDao.findVideoTypeById(1));
//
//
//
//    }
//
//    @Test
//    public void demo() {
////        videoTypeDao.addVideoType();
////        videoTypeDao.deleteVideoType();
////        videoTypeDao.findVideoTypeById();
////        videoTypeDao.updateVideoType();
//        VideoType videoType = new VideoType();
//        videoType.setTypeName("分类20");
//        videoType.setOrderNum(0);
//
//        System.out.println("---------addVideoType----------");
//        videoTypeDao.addVideoType(videoType);
//
//        VideoType videoTypeById = videoTypeDao.findVideoTypeById(3);
//
//        videoTypeById.setTypeName("更新后");
//        System.out.println("-------updateVideoType--------");
//        videoTypeDao.updateVideoType(videoTypeById);
//
//        System.out.println("------getCount-------");
//        System.out.println(videoTypeDao.getCount());
//
//        System.out.println("------deleteVideoType------");
//        videoTypeDao.deleteVideoType(videoTypeById);
//        System.out.println(videoTypeDao.getCount());
//
//
//    }
//}
