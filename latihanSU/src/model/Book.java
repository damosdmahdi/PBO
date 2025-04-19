/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author damos
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;

    // Constructor
    public Book(String newTitle, String newAuthor, int newYear) {
        this.title = newTitle;
        this.author = newAuthor;
        this.yearPublished = newYear;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newYear) {
        this.yearPublished = newYear;
    }
}
