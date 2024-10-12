/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.pg.ApiBookManager.Book.Manager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.gt.pg.ApiBookManager.Book.Manager.Model.BookManager;

/**
 *
 * @author strdh
 */
@Repository
public interface BookRepository extends JpaRepository<BookManager, Long> {
    
}
