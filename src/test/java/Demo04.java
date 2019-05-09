//import com.guo.dao.UserDao;
//import com.guo.model.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * @ClassName： Demo04
// * @author： 98231
// * @create： 2019-01-07 13:34
// * @desc： 测试UserDao
// **/
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
//public class Demo04 {
//
//    @Autowired
//    UserDao userDao;
//
//    @Test
//    public void demo01() {
//        User user = new User();
//        user.setUserName("gyb");
//        user.setEmail("982317078@qq,com");
//        user.setImageAddress("Url");
//        user.setPassword("982317078");
//        user.setProfile("磁轭人");
//        user.setSign("Zhe Ge Ren Hen Lan!");
//
//
//        userDao.addUser(user);
//
//        User user1 = new User();
//        user1.setId(1);
//
//        System.out.println("————————————————————findUserById————————————————————————————");
//        User userById = userDao.findUserById(user1);
//        System.out.println(userById.getUserName());
//
//        System.out.println("————————————————————findUserByUserName————————————————————————————");
//        User userByUserName = userDao.findUserByUserName("gyb");
//        System.out.println(userByUserName.getUserName());
//
//
//        User user2 = new User();
//        user2.setId(5);
//        user2.setUserName("gyb");
//
//        user2.setEmail("982317078@qq,com");
//        user2.setImageAddress("Url");
//        user2.setPassword("982317078");
//        user2.setProfile("磁轭人");
//        user2.setSign("Zhe Ge Ren Hen Lan!");
//
//
//        userDao.addUser(user2);
//
//        System.out.println("------------");
//        System.out.println(userDao.getCount());
//        System.out.println("--------delete---------");
//        userDao.deleteUser(user2);
//        System.out.println(userDao.getCount());
//
//
//
//    }
//
//    @Test
//    public void demo() {
////        userDao.addUser();
////        userDao.deleteUser();
////        userDao.findUserById();
////        userDao.findUserByUserName();
////        userDao.updateUser();
//
//        User user = new User();
//        user.setId(4);
//        user.setSign("测试用");
//        user.setProfile("简介");
//        user.setPassword("123654");
//        user.setEmail("982317078@qq.com");
//        user.setImageAddress("URl");
//        userDao.updateUser(user);
//    }
//}
