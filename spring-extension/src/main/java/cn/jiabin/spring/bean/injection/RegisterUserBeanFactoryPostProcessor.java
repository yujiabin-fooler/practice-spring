package cn.jiabin.spring.bean.injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author jiabin.yu
 * @date 2023/1/29 23:44
 */
public class RegisterUserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        //创建一个User对象
        User user = new User();
        user.setUsername("java日记");
        //将这个User对象注入到Spring容器中
        beanFactory.registerSingleton("user", user);
    }

}
