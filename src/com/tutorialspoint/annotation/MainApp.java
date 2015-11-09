package com.tutorialspoint.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorialspoint.HelloWorld;

public class MainApp {

	
	public static void main(String[] args) {

		ApplicationContext ctx= new AnnotationConfigApplicationContext(HelloWorldConfig.class);

HelloWorld helloWorld =ctx.getBean(HelloWorld.class);

helloWorld.setMessage1("Salut Viorel");
System.out.println(helloWorld.getMessage1());
	}

}
