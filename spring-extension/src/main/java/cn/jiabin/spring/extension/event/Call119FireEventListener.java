package cn.jiabin.spring.extension.event;

import org.springframework.context.ApplicationListener;

/**
 * @author jiabin.yu
 * @date 2022/7/18 11:21
 */
public class Call119FireEventListener implements ApplicationListener<FireEvent> {

    @Override
    public void onApplicationEvent(FireEvent event) {
        System.out.println("打119");
    }

}
