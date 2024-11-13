package cn.jiabin.spring.extension.springbootextension.propertysourceloader;

import cn.jiabin.spring.extension.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author jiabin.yu
 * @date 2022/7/17 19:28
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class);

        User user = applicationContext.getBean(User.class);

        System.out.println("获取到的Bean为" + user + "，属性username值为：" + user.getUsername());
    }


    @Bean
    public User user() {
        return new User();
    }

}
