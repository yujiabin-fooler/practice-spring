package cn.jiabin.spring.extension.factorybean;

import cn.jiabin.spring.extension.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author jiabin.yu
 * @date 2022/7/16 23:20
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        System.out.println("调用 UserFactoryBean 的 getObject 方法生成 Bean:" + user);
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}
