package cn.jiabin.spring.extension.springbootextension;

import cn.jiabin.spring.extension.factorybean.UserFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiabin.yu
 * @date 2022/7/17 19:20
 */
@Configuration
public class UserAutoConfiguration {

    @Bean
    public UserFactoryBean userFactoryBean() {
        return new UserFactoryBean();
    }

}
