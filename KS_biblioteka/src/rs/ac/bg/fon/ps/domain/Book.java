/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Book {
    private Long bookId;
    private String name;
    private Integer yearOfPublication;
    private BookGenre bookGenre;
    private List<Author> authors;
     
    public Book() {
    }

    public Book(Long bookId, String name, Integer yearOfPublication, BookGenre bookGenre) {
        this.bookId = bookId;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.bookGenre = bookGenre;
    }

    public Book(Long bookId, String name, Integer yearOfPublication, BookGenre bookGenre, List<Author> authors) {
        this.bookId = bookId;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.bookGenre = bookGenre;
        this.authors = authors;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Long getBookId() {
        return bookId;
    }
    
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    
}
