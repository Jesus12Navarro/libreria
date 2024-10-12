/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.pg.ApiBookManager.Book.Manager.Service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Controller.BookManagerController;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Model.BookManager;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Repository.BookRepository;

/**
 *
 * @author strdh
 */
@Service
public class BookService {
     
    private static final Logger logger = Logger.getLogger(BookService.class);
    
    @Autowired
    private BookRepository bookRepository;
    
    public List<BookManager> findAll() {
        //productRepository
        logger.info("prepare find All");
        return bookRepository.findAll();
    }
    
    public Optional<BookManager> findById(Long bookId) {
        return bookRepository.findById(bookId);
    }
    
    public BookManager save(BookManager bookmanager) {
        return bookRepository.save(bookmanager);
    }
    
    public boolean deleteById(Long bookId) {
        if(bookRepository.existsById(bookId)) {            
            bookRepository.deleteById(bookId);
            return true;
        } 
        return false;
    }
    
    public Optional<BookManager> update(Long bookId, BookManager bookmanager) {
        Optional<BookManager> existingBookManager = findById(bookId);
        if(existingBookManager.isPresent()) {
            BookManager p = existingBookManager.get();
            p.setQualification(bookmanager.getQualification());
            p.setAuthor(bookmanager.getAuthor());
            p.setCisbn(bookmanager.getCisbn());
            p.setPublisheddate(bookmanager.getPublisheddate());
            return Optional.of(bookRepository.save(p));
        }
        return Optional.empty();
    }
}