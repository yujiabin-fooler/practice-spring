package cn.jiabin.spring.basic.typeconverter;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Value;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
*
 *@author  jiabin.yu
 * @date 2023/7/22 23:08
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        //将字符串转换成Date
        Date date = DateUtil.parseDateTime(text);

        //设置到Value中，之后Spring就可以通过getValue获取到Date值
        setValue(date);
    }

}
