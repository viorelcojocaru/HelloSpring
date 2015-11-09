package com.tutorialspoint.annotationbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	
	public static void main(String[] args){
	
	ApplicationContext ctx =new AnnotationConfigApplicationContext(ConfigB.class);

	A a=(A)ctx.getBean("a");
	B b=(B)ctx.getBean("b");
	b.setMessageB("hello");
	a.setMessageA(" Viorel");
	System.out.print(b.getMessageB());	
	System.out.println(a.getMessageA());

	}


}
 		