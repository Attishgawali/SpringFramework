package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneConfig.xml");
		
		
		Person p2 = (Person) context.getBean("person2");
		System.out.println(p2);
		System.out.println(p2.getFriends());
		System.out.println(p2.getFriends().getClass().getName());
		System.out.println(p2.getFeestructure());
		System.out.println(p2.getFeestructure().getClass().getName());
		System.out.println(p2.getProperties());
		System.out.println(p2.getProperties().getClass().getName());
	}

}