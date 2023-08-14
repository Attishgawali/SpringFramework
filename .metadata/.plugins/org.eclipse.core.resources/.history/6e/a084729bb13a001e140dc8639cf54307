package com.springcore.constructoeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructoeInjection/ciconfig.xml");
		
		Person p1= (Person)context.getBean("person1");
		System.out.println(p1);
	}

}
