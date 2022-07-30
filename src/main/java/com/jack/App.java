package com.jack;

import com.jack.config.SpringConfig;
import com.jack.domain.Cargo;
import com.jack.service.ICargoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //加载配置文件初始化容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBeanDefinitionCount());

        ICargoService cargoService = ctx.getBean(ICargoService.class);
        List<Cargo> carGos = cargoService.findAll();
        System.out.println("————————————————————————————————————————————————————————————————————————————————");
        carGos.forEach(System.out::println);
        System.out.println("————————————————————————————————————————————————————————————————————————————————");

    }
}
