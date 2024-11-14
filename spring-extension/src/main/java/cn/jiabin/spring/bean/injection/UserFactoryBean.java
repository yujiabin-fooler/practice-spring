package cn.jiabin.spring.bean.injection;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author jiabin.yu
 * @date 2022/7/16 23:20
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("java日记");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}
