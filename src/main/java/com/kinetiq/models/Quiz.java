package com.kinetiq.models;

public class Quiz {
    private String id;
    private String title;
    private String description;
    private String[] questions;

    // Constructors
    public Quiz() {}

    public Quiz(String id, String title, String description, String[] questions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String[] getQuestions() { return questions; }
    public void setQuestions(String[] questions) { this.questions = questions; }
}