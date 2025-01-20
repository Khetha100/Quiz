package org.example;

public class QuizModel {

    private final String question;
    private final String[] options;
    private final String correctAnswer;


    public QuizModel(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


}
