import com.kuang.dao.UserDaoMySqlImpl;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
    /*
        //用户实际调用的是业务层，DAO层他们不需要接触
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    */

    //获取ApplicationContext，拿到容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }

}
