package cn.jiabin.spring.extension.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author jiabin.yu
 * @date 2022/7/18 11:18
 */
public class FireEvent extends ApplicationEvent {

    public FireEvent(String source) {
        super(source);
    }

}
