package com.ki.designPattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractQuestion implements Question {

	protected List<String> questions = new ArrayList<String>();
	private int current = 0;

	public AbstractQuestion() {
		addQuestions();
	}

	public void nextQuestion() {
		if (current <= questions.size() - 1)
			current++;
		System.out.print(current);
	}

	public void previousQuestion() {
		if (current > 0)
			current--;
	}

	public void newQuestion(String quest) {
		questions.add(quest);
	}

	public void deleteQuestion(String quest) {
		questions.remove(quest);
	}

	public void displayQuestion() {
		System.out.println(questions.get(current));
	}

	public void displayAllQuestions() {
		for (String quest : questions) {
			System.out.println(quest);
		}
	}
	abstract public void addQuestions();
}
