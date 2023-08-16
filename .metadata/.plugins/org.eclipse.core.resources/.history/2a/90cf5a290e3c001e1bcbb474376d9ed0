package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown hook
		context.registerShutdownHook();
				
		Book b1= (Book)context.getBean("book1");
		System.out.println(b1);
		
		
		Car c = (Car) context.getBean("car1");
		System.out.println(c);
		

	}

}
