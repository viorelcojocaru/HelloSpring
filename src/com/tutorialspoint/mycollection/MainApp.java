package com.tutorialspoint.mycollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	private static MyCollection myCollection;
	
	public static void main(String[] args) {
	ApplicationContext ctx =new ClassPathXmlApplicationContext("BeansMyCollection.xml");
	
	myCollection=(MyCollection)ctx.getBean("myCollection");
		
	
	
	myCollection.getAddressList();
	
	myCollection.getAddressSet();
	myCollection.getAddressMap();
	myCollection.getAddressProperties();
	
	}
	
	
}
