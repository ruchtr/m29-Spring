package org.tnsif.autowiredmodes;

public class TextEditor {

	private SpellChecker checker;
	
	
	
	public SpellChecker getChecker() {
		return checker;
	}
	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}
	
	public void print() {
		System.out.println(checker+" ");
		
	}
	
	
	
	
}
