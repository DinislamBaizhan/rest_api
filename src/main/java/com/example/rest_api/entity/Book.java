package com.example.rest_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "yearsofpublishing")
    private int yearsOfPublishing;

    public Book() {
    }

    public Book(String name, String author, int yearsOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearsOfPublishing = yearsOfPublishing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearsOfPublishing() {
        return yearsOfPublishing;
    }

    public void setYearsOfPublishing(int yearsOfPublishing) {
        this.yearsOfPublishing = yearsOfPublishing;
    }
}
