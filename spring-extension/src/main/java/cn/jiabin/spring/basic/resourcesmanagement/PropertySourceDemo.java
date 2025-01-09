package cn.jiabin.spring.basic.resourcesmanagement;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
*
 *@author  jiabin.yu
 * @date 2023/7/22 18:31
 */
public class PropertySourceDemo {

    public static void main(String[] args) {

        Map<String, Object> source = new HashMap<>();
        source.put("name", "@autho jiabin.yu");

        PropertySource<Map<String, Object>> propertySource = new MapPropertySource("myPropertySource", source);

        Object name = propertySource.getProperty("name");

        System.out.println("name = " + name);
    }

}
