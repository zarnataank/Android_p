package com.example.projectZarna;

public class MyinterviewModel {
   java.lang.String questions;
   java.lang.String answer;
    boolean expnadable;

    public java.lang.String getQuestions() {
        return questions;
    }

    public void setQuestions(java.lang.String questions) {
        this.questions = questions;
    }

    public java.lang.String getAnswer() {
        return answer;
    }

    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }

    public boolean isExpnadable() {
        return expnadable;
    }

    public void setExpnadable(boolean expnadable) {
        this.expnadable = expnadable;
    }

    public MyinterviewModel(java.lang.String questions, java.lang.String answer) {
        this.questions = questions;
        this.answer = answer;
        this.expnadable = false;
    }
}
