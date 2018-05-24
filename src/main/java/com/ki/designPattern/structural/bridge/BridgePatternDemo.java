package com.ki.designPattern.structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		QuestionFormat questions = new QuestionFormat("Java Programming Language");
		questions.q = new JavaQuestions();
		questions.delete("what is class?");
		questions.display();
		questions.newOne("What is inheritance? ");
		questions.newOne("How many types of inheritance are there in java?");
		questions.displayAll();
		
		questions = new QuestionFormat("PHP Programming Language");
		questions.q = new PhpQuestions();
		questions.delete("what is class?");
		questions.display();
		questions.newOne("What is inheritance? ");
		questions.newOne("How many types of inheritance are there in php?");
		questions.displayAll();
	}

}
