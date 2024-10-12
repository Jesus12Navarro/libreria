/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.pg.ApiBookManager.Book.Manager.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author strdh
 */
@Entity
@Table(name = "Biblioteca")
public class BookManager {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    
    @Column(nullable = false)
    private String qualification;
    
    @Column(nullable = false)
    private String author;
        
    @Column(nullable = false)
    private String cisbn;
    
    @Column(nullable = false)
    private LocalDate publisheddate;    

    public BookManager() {
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookd(Long bookId) {
        this.bookId = bookId;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCisbn() {
        return cisbn;
    }

    public void setCisbn(String cisbn) {
        this.cisbn = cisbn;
    }

    public LocalDate getPublisheddate() {
        return publisheddate;
    }

    public void setPublisheddate(LocalDate publisheddate) {
        this.publisheddate = publisheddate;
    }
    

    @Override
    public String toString() {
        return "Product{"
                + "id =" + bookId
                + ", titulo = '" + qualification + "\""
                + ", author = '" + author + "\""
                + ", cisbn = '" + cisbn + "\""
                + ", publisheddate = '" + publisheddate;
    }

}
