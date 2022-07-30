package com.jack.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.jack.controller")
////@PropertySource：加载类路径jdbc.properties文件
//@PropertySource("classpath:jdbc.properties")
////@Import:导入配置信息(此处在@ComponentScan("com.jack")行已包括)
//@Import({JdbcConfig.class,MybatisConfig.class})
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {


}
