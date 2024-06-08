package com.yo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
//		A bean = (A) context.getBean("aFactoryBean");
//		System.out.println(bean);
//
//
//	}


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");

	}


}
