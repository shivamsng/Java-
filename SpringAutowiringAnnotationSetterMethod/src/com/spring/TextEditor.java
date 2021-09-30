package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	public SpellChecker spellChecker;// this is HAS- relation ship from core java concept

	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	//This method belongs to TextEditor class
	public void spellCheck() {
		//calling spellchecker clas
		spellChecker.checkSpelling();//try to call another class
	}
	
	
}
