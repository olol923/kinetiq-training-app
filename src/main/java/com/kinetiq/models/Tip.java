package com.kinetiq.models;

import java.util.Objects;

public class Tip {
    private String title;
    private String description;
    private String category;
    private String author;
    private String createdAt;

    public Tip(String title, String description, String category, String author, String createdAt) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.author = author;
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tip)) return false;
        Tip tip = (Tip) o;
        return Objects.equals(title, tip.title) && Objects.equals(description, tip.description) && Objects.equals(category, tip.category) && Objects.equals(author, tip.author) && Objects.equals(createdAt, tip.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, category, author, createdAt);
    }
}