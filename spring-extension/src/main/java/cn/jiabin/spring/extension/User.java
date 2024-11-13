package cn.jiabin.spring.extension;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author snayou
 * @date 2022/7/16 21:53
 */
@Getter
@Setter
@Accessors(chain = true)
public class User {

    @Value("${sanyou.username:}")
    private String username;

}
