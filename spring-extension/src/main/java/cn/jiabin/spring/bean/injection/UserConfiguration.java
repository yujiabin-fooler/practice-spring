package cn.jiabin.spring.bean.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author jiabin.yu
 * @date 2023/1/28 23:32
 */
@Configuration
public class UserConfiguration {

    @Bean
    public User user() {
        return new User();
    }

}
