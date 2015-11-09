package com.tutorialspoint.annotation.texteditor;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("inside texteditor constructor");
		this.spellChecker=spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}

}
