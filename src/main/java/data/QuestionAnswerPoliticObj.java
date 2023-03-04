package data;

import java.io.Serializable;

public class QuestionAnswerPoliticObj implements Serializable {
	private int questionId;
	private String question;
	private int questionAnswer;
	private int politicianAnswer;

	public QuestionAnswerPoliticObj() {

	}

	public QuestionAnswerPoliticObj(int questionId, String question, int questionAnswer, int politicianAnswer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.questionAnswer = questionAnswer;
		this.politicianAnswer = politicianAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public int getPoliticianAnswer() {
		return politicianAnswer;
	}

	public void setPoliticianAnswer(int politicianAnswer) {
		this.politicianAnswer = politicianAnswer;
	}



}