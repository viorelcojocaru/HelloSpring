package com.tutorialspoint.texteditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("BeansTextEditor.xml");
		
		TextEditor textEditor= (TextEditor)ctx.getBean("textEditor");
		textEditor.spellCheck();

	}

}
