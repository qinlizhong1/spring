package typeconversion;

import lombok.Data;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 示例是将字符串类型转换为Date类型
 * 第一个泛型：需要转换的类型String
 * 第二个泛型：转换的目的类型，这里是Date
 */
@Data
public class MyConvert implements Converter<String, Date> {
    private String pattern;

    @Override
    public Date convert(String source) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            date = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
