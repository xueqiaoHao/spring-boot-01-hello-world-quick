package com.atguigu;


import com.atguigu.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot01HelloWorldQuickApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextContains(){
		System.out.println(ioc.containsBean("helloService02"));

	}
	String a="号";
	@Test
	void contextLoads() {
		System.out.println(person);
		System.out.println(a);
	}



}
