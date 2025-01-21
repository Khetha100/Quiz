package org.example;

import java.util.Scanner;

public class QuizServiceImpl implements QuizService{

    String answer;
    int score;

    String[] allOptions = { " a) Paris\n b) Rome\n c) Madrid \n d) Berlin\n",
            " a) William Shakespeare\n b) Charles Dickens \n c) Jane Austen \n d) J.K. Rowling\n"};


    String[] questions ={"What is the capital of France?", "Who wrote 'Romeo and Juliet?"};

    String[] correctAnswer = {
            "a",
            "a"
    };


    @Override
    public void startQuiz(){
        System.out.println("Welcome to the quiz");
        for(int i = 0; i < questions.length; i++){
            QuizModel obj =  new QuizModel(questions[i], allOptions[i], correctAnswer[i]);
            System.out.println(obj.getQuestion());
            System.out.println(obj.getOptions());

           this.answer =  getUserInput();
           trackScore(obj);

        }
        System.out.println("You got " + score + " out of 2 questions");
    }

    @Override
    public String getUserInput(){
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    @Override
    public void trackScore(QuizModel quizModel){
        if(answer.toLowerCase().equals(quizModel.getCorrectAnswer())){
            score++;
        }
    }




}
