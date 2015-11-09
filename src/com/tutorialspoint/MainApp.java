package com.tutorialspoint;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
//		AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
//		ctx.start();
		HelloWorld h= (HelloWorld)ctx.getBean("helloWorld");
//		h.printMessage();
//		h.setMessage("Sunt un obiect");
//		h.setMessage("Salut");
		System.out.println(h.getMessage());
		
//		HelloWorld h1= (HelloWorld)ctx.getBean("helloWorld");
//		h1.setMessage("Sunt al doilea");
//		System.out.println(h1.getMessage());
//		HelloIndia h2= (HelloIndia)ctx.getBean("helloIndia");
//		h2.setMessage("Sunt al treilea");
//		System.out.println(h2.getMessage ());
//		System.out.println(h2.getMessage1());
//		System.out.println(h2.getMessage2());
//		System.out.println(h2.getMessage3());
		
//		ctx.registerShutdownHook();
//		ctx.stop();
	}
	
}

