package com.jack.controller;

import com.jack.dao.CarGo;
import com.jack.service.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     //使用@RestController注解替换@Controller与@ResponseBody注解，简化书写
@RequestMapping("/carGos")
public class CargoController {

    @Autowired
    private ICargoService cargoService;

    //设置映射路径为/save，即外部访问路径
    @RequestMapping("/save")
    //设置当前操作返回结果为指定json数据（本质上是一个字符串信息）
//    public String save(@RequestParam("name") String userName , String age){
//    public String save(CarGo carGo){
    public String save(@RequestBody List<String> carGos){
        System.out.println("普通参数传递carGos ==> " + carGos);
        System.out.println("save ...");
        return "{'info':'springmvc'}";
    }


    @PostMapping //使用@PostMapping简化Post请求方法对应的映射配置
    public String saveRestful(){
        System.out.println("carGos save...");
        return "{'module':'carGos save'}";
    }

    @DeleteMapping("/{id}")  //使用@DeleteMapping简化DELETE请求方法对应的映射配置
    public String delete(@PathVariable Integer id){
        System.out.println("carGos delete..." + id);
        return "{'module':'carGos delete'}";
    }

    //设置当前请求方法为PUT，表示REST风格中的修改操作
    @PutMapping   //使用@PutMapping简化Put请求方法对应的映射配置
    public String update(@RequestBody CarGo carGo){
        System.out.println("carGo update..." + carGo);
        return "{'module':'carGo update'}";
    }

    @GetMapping("/{id}")    //使用@GetMapping简化GET请求方法对应的映射配置
    public String getById(@PathVariable Integer id){
        System.out.println("carGo getById..."+id);
        return "{'module':'carGo getById'}";
    }

    @GetMapping      //使用@GetMapping简化GET请求方法对应的映射配置
    public List<?> getAll(){
        System.out.println(cargoService.findAll());
        System.out.println("carGo getAll...");
        List<CarGo> carGoList = cargoService.findAll();
//        return "{'module':'carGo getAll'}";
        return carGoList;
    }
}
