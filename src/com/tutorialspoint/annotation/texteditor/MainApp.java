package com.tutorialspoint.annotation.texteditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor textEditor= (TextEditor)ctx.getBean(TextEditor.class);
		
		textEditor.spellCheck();

	}

}
