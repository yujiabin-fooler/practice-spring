package cn.jiabin.spring.basic.internationalism;

import java.text.MessageFormat;

/**
*
 *@author  jiabin.yu
 * @date 2023/7/24 00:19
 */
public class MessageFormatDemo {

    public static void main(String[] args) {
        String message = MessageFormat.format("你好：{0}", "张三");
        System.out.println("message = " + message);
    }

}
