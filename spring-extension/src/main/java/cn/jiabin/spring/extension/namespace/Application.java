package cn.jiabin.spring.extension.namespace;

import cn.jiabin.spring.extension.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiabin.yu
 * @date 2022/7/16 22:45
 */
public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);

        System.out.println(user);

    }

}
