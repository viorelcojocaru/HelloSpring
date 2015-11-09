package com.tutorialspoint.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {


	public static void main(String[] args) {

		ApplicationContext ctx =new ClassPathXmlApplicationContext("BeansTest.xml");
		
		Test test =(Test)ctx.getBean("test");
		
//		test.testMethod();

	}

}
