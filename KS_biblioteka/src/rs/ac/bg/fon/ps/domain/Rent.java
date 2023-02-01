/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Rent {
    private Long rentId;
    private Date rentalDate;
    private Date returnDate;
    private Boolean active;
    private Book book;
    private Member member;

    public Rent() {
    }

    public Rent(Long rentId, Date rentalDate, Date returnDate, Boolean active, Book book, Member member) {
        this.rentId = rentId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.active = active;
        this.book = book;
        this.member = member;
    }

    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
    
    
}
