package annotation.configuration.p1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ComponentScan没有参数，默认只扫码其所在当前包及其子包下是否有Componet等注解，因此p2下的Teacher不能被扫描到。
@ComponentScan({"annotation.configuration"})
@Configuration
public class MyConfig {
}
