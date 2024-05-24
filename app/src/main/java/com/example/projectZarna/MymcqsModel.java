package com.example.projectZarna;

public class MymcqsModel {
    java.lang.String questions;
    java.lang.String answer;
    boolean expandable;

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

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public MymcqsModel(java.lang.String questions, java.lang.String answer) {
        this.questions = questions;
        this.answer = answer;
        this.expandable = false;
    }

}
