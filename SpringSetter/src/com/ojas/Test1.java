package com.ojas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[]args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.cfg1.xml");
		Employee emp=(Employee)ctx.getBean("obj1");
		System.out.println(emp);
		
}
}
