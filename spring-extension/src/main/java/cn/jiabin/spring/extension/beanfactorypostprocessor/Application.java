package cn.jiabin.spring.extension.beanfactorypostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiabin.yu
 * @date 2022/7/17 18:08
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 MyBeanFactoryPostProcessor 注册到容器中
        applicationContext.register(MyBeanFactoryPostProcessor.class);
        applicationContext.refresh();
    }

}
