package cn.jiabin.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiabin.yu
 * @date 2023/1/29 22:05
 */
public class UserBeanDefinitionRegistryPostProcessorDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(UserBeanDefinitionRegistryPostProcessor.class);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}
