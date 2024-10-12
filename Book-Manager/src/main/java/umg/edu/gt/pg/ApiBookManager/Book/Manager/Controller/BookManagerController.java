/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.pg.ApiBookManager.Book.Manager.Controller;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Model.BookManager;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Service.BookService;

/**
 *
 * @author strdh
 */
@RestController 
@RequestMapping("/Biblioteca")
public class BookManagerController {
    
        
    private static final Logger logger = Logger.getLogger(BookManagerController.class);
    
    @Autowired
    private BookService bookService;
    
    @GetMapping
    public List<BookManager> getAllBibliotecas() {
        logger.info("init find All");
        return bookService.findAll();
    }
    
    @GetMapping("/{bookId}")
    public Optional<BookManager> getProductById(@PathVariable Long bookId) {
        return bookService.findById(bookId);
    }
    
    @PostMapping
    public BookManager createBookManager(@RequestBody BookManager bookManager) {
        return bookService.save(bookManager);
    }
    
    @PutMapping("/{bookId}")
    public Optional<BookManager> updateProduct(@PathVariable Long bookId, @RequestBody BookManager bookManager) {
        return bookService.update(bookId, bookManager);
    }
    
    @DeleteMapping("/{bookId}")
    public String deleteBookManager(@PathVariable Long bookId) {
        boolean deleted = bookService.deleteById(bookId);        
        return deleted ? "Libro eliminado" : "Libro no eliminado";
    }
    
}
