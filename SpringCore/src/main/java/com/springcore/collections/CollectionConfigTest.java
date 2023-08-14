package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionConfigTest {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		
		Employee emp1 =(Employee) context.getBean("employee1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());

	}

}
