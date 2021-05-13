package com.ojas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.cfg.xml");
	      
	    Student student=(Student)ctx.getBean("obj");  
	    
	    System.out.println(student);
	    
	    student.displayInfo();
	    
	}

}
