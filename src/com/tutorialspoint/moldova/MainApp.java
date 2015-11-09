package com.tutorialspoint.moldova;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("BeansMoldova.xml");
	
	Stefan stefan=(Stefan)ctx.getBean("stefan");  
	
	stefan.going();
	System.out.println(stefan.getWealth());
	
	MViteazu mihaiViteazu =(MViteazu)ctx.getBean("mViteazu");
	mihaiViteazu.going();
	Wealth wealth=new Wealth();
	wealth.setWealth(2000);
	mihaiViteazu.setWealth(wealth);
	System.out.println(mihaiViteazu.getWealth());
	
	}
}
