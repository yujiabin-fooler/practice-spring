package cn.jiabin.spring.bean.injection;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author jiabin.yu
 * @date 2023/1/28 21:30
 */
public class PropertiesBeanInjectionDemo {

    public static void main(String[] args) {

        GenericApplicationContext applicationContext = new GenericApplicationContext();
        //创建一个PropertiesBeanDefinitionReader，可以从properties读取Bean的信息，将读到的Bean信息放到applicationContext中
        PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(applicationContext);
        //创建一个properties文件对应的Resource对象
        Resource classPathResource = new ClassPathResource("PropertiesBeanInjectionDemo.properties");
        //加载配置文件
        propReader.loadBeanDefinitions(classPathResource);
        applicationContext.refresh();
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}
