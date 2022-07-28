package com.jack.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.jack")
//@Import:导入配置信息(此处在9行已包括)
@Import({JdbcConfig.class})
public class SpringConfig {
}
