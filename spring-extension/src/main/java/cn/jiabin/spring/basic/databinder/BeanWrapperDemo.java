package cn.jiabin.spring.basic.databinder;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
*
 *@author  jiabin.yu
 * @date 2023/7/23 16:46
 */
public class BeanWrapperDemo {

    public static void main(String[] args) {
        //创建user对象
        User user = new User();

        //创建BeanWrapper对象，把需要进行属性绑定的对象放进去
        BeanWrapper beanWrapper = new BeanWrapperImpl(user);

        //进行数据绑定，将@autho jiabin.yu这个属性值赋值到username这个属性上
        beanWrapper.setPropertyValue(new PropertyValue("username", "@autho jiabin.yu"));

        System.out.println("username = " + user.getUsername());
    }

}
