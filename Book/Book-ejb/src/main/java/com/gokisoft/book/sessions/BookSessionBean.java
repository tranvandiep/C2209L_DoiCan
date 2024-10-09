/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.book.sessions;

import com.gokisoft.book.controllers.BooksJpaController;
import com.gokisoft.book.entities.Books;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Stateless
public class BookSessionBean implements BookSessionBeanLocal {
    private final EntityManagerFactory factory;
    private final BooksJpaController controller;
    
    public BookSessionBean() {
        factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        controller = new BooksJpaController(factory);
    }
    
    @Override
    public List<Books> getBookList() {
        return controller.findBooksEntities();
    }

}
