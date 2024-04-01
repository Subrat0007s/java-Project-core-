package com.map;

import java.util.List;

public class Question {
	private String question;
	private List<String> choices;
	private int correctChoice;

	public Question(String question, List<String> choices, int correctChoice) {
		this.question = question;
		this.choices = choices;
		this.correctChoice = correctChoice;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getChoices() {
		return choices;
	}

	public int getCorrectChoice() {
		return correctChoice;
	}

}