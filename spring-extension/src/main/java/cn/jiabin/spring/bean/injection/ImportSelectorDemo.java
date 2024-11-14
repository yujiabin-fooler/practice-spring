package cn.jiabin.spring.bean.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author jiabin.yu
 * @date 2023/1/29 12:28
 */
@Import(UserImportSelector.class)
public class ImportSelectorDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将 ImportSelectorDemo 注册到容器中
        applicationContext.register(ImportSelectorDemo.class);
        applicationContext.refresh();

        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}
