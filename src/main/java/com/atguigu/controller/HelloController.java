package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao
 * Description 这个类所有的方法返回的数据都直接写给浏览器。如果是对象就转为json数据
 * @date 2020/3/14
 */
@RestController
public class HelloController {

    /**
     *desc: 
     * @date 2020/3/14
     *
     * 1、要返回给浏览器数据需要加    @ResponseBody
    2、可以把    @ResponseBody加在类上。这样所有的方法都可以用。
    3、 最后可以直接用@RestController注解代替 @Controller+@ResponseBody
     * @return java.lang.String
     */
    @Value("${person.name}")
    private String name;
    @RequestMapping("/hello")
    public String hello(){
        return "hello "+name;
    }

    @Bean
    public HelloService helloService02(){
        System.out.println("添加了helloService");
        return new HelloService();
    }
}
