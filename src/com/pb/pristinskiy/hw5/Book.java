package com.pb.pristinskiy.hw5;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String getInfo() {
        return "[название: " + title + ", автор: " + author + ", год: "
                + year + "]";
    }
}
