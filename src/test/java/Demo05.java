//import com.guo.dao.VideoDao;
//import com.guo.dao.VideoTypeDao;
//import com.guo.model.Video;
//import com.guo.model.VideoType;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * @ClassName： Demo05
// * @author： 98231
// * @create： 2019-01-07 14:18
// * @desc： 测试VideoDao
// **/
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo05 {
//
//    @Autowired
//    VideoDao videoDao;
//
//
//    @Autowired
//    VideoTypeDao videoTypeDao;
//
//    @Test
//    public void demo01() {
//        Video video = new Video();
//        video.setTitle("测试");
//        video.setTimeLength(1000);
//        VideoType videoType = videoTypeDao.findVideoTypeById(1);
//        video.setVideoType(videoType);
//        videoDao.addVideo(video);
//
//
//        System.out.println("-----------findById-------------");
//        Video byId = videoDao.findById(1);
//        System.out.println(byId.getTitle());
//
//        System.out.println("------------fndAll--------------------");
//        List<Video> all = videoDao.findAll();
//        for (Video video1 : all) {
//            System.out.println(video1.getTitle());
//        }
//
//        System.out.println("-------------findByVideoType------------");
//        List<Video> byVideoType = videoDao.findByVideoType(1);
//        for (Video video1 : byVideoType) {
//            System.out.println(video1.getTitle());
//        }
//
//    }
//
//    @Test
//    public void demo() {
////        videoDao.addVideo();
////        videoDao.deleteVideo();
////        videoDao.findAll();
////        videoDao.findById();
////        videoDao.findByVideoType();
////        videoDao.updateVideo();
//
//
//        System.out.println("----getCount--");
//        System.out.println(videoDao.getCount());
//
//        Video video1 = videoDao.findById(3);
//        video1.setTitle("更新title");
//        videoDao.updateVideo(video1);
//
//        Video byId = videoDao.findById(3);
//        System.out.println(byId.getTitle());
//
//        videoDao.deleteVideo(byId);
//        System.out.println(videoDao.getCount());
//
//    }
//}
