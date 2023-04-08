### 类型转换
步骤：
1. 实现Converter<String, Date> 接口
2. springContext.xml配置文件注入类型转换器
``
    <bean id="myConverter" class="typeconversion.MyConverter"></bean>

    <bean id="conversionService" class="org.springframework.context.support.ConversionServiceFactoryBean">
        <property name="converters">
            <set>
                <ref bean="myConverter"></ref>
            </set>
        </property>
    </bean>
``

