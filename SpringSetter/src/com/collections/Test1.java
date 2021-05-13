package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[]args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.cfg2.xml");
		Employee1 emp=(Employee1)ctx.getBean("obj1");
		System.out.println(emp);
		
}
}