package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireConfig.xml");
		
		Emp emp= (Emp)context.getBean("emp1");
		System.out.println(emp);

	}

}
