package com.springcore.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referenceType/refernceConfig.xml");
		DependantA A=(DependantA)context.getBean("dependantA");
		System.out.println(A);
		System.out.println(A.getX());
		System.out.println(A.getB().getY());
	}

}
