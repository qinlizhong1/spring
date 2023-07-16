package annotation.importSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 用于配置类引入xml配置的bean，本示例中：Student对应的bean是在xml文件中配置的，但是在代码中不需要读取配置文件了。
 *                                  通过读取配置bean也能获取到，这就是ImportResource作用
 */
@Configuration
@ImportResource("classpath:annotation/importSource/springContext.xml")
public class MyConfig {

    @Bean
    public Teacher teacher(){
        return new Teacher("唐老师", 66);
    }
}
