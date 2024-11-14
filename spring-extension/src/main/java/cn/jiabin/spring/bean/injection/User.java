package cn.jiabin.spring.bean.injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author jiabin.yu
 * @date 2022/7/16 21:53
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User {

    private String username;

}
