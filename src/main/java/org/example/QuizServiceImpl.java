package org.example;

import java.util.Scanner;

public class QuizServiceImpl implements QuizService{

    String answer;
    int score;

    String[] allOptions = { " a) Paris\n b) Rome\n c) Madrid \n d) Berlin\n",
            " a) William Shakespeare\n b) Charles Dickens \n c) Jane Austen \n d) J.K. Rowling\n"};


    String[] questions ={"Who wrote 'Romeo and Juliet?", "What is the capital of France?"};

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
           trackScore(i);

        }
        System.out.println("You got "+score);
    }

    @Override
    public String getUserInput(){
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    @Override
    public void trackScore(int questionIndex){
        if(answer.equals(correctAnswer[questionIndex])){
            score++;
        }
    }




}
