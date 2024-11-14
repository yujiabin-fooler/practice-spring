package cn.jiabin.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author jiabin.yu
 * @date 2023/1/29 21:56
 */
@Import(UserImportBeanDefinitionRegistrar.class)
public class UserImportBeanDefinitionRegistrarDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(UserImportBeanDefinitionRegistrarDemo.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}
