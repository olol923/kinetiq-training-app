package com.kinetiq.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class QuizService {

    private List<Quiz> quizzes;

    public QuizService() {
        this.quizzes = new ArrayList<>();
    }

    public void createQuiz(String title, List<String> questions) {
        Quiz quiz = new Quiz(title, questions);
        quizzes.add(quiz);
    }

    public Optional<Quiz> getQuiz(String title) {
        return quizzes.stream()
                      .filter(quiz -> quiz.getTitle().equals(title))
                      .findFirst();
    }

    public List<Quiz> getAllQuizzes() {
        return new ArrayList<>(quizzes);
    }

    public void deleteQuiz(String title) {
        quizzes.removeIf(quiz -> quiz.getTitle().equals(title));
    }
}

class Quiz {
    private String title;
    private List<String> questions;

    public Quiz(String title, List<String> questions) {
        this.title = title;
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getQuestions() {
        return questions;
    }
}