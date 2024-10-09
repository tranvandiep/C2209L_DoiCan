/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.book.sessions;

import com.gokisoft.book.entities.Books;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Local
public interface BookSessionBeanLocal {
    List<Books> getBookList();
}
