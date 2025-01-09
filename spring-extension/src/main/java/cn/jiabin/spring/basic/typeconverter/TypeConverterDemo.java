package cn.jiabin.spring.basic.typeconverter;

import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.TypeConverter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.Resource;

/**
*
 *@author  jiabin.yu
 * @date 2023/7/23 02:32
 */
public class TypeConverterDemo {

    public static void main(String[] args) {


        SimpleTypeConverter typeConverter = new SimpleTypeConverter();

        //设置ConversionService
        typeConverter.setConversionService(DefaultConversionService.getSharedInstance());

        //将字符串"true"转换成Boolean类型的true
        Boolean b = typeConverter.convertIfNecessary("true", Boolean.class);
        System.out.println("b = " + b);
    }

}
