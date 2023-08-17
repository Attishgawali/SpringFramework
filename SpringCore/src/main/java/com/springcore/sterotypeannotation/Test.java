package com.springcore.sterotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotypeannotation/sterotypeConfig.xml");
		
		Planets planet= context.getBean("planets",Planets.class);
		System.out.println(planet);
	}
}