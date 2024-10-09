/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.book.sessions;

import com.gokisoft.book.entities.Users;
import jakarta.ejb.Local;

/**
 *
 * @author dieptv
 */
@Local
public interface UsersSessionBeanLocal {
    Users login(String email, String password);
    void register(Users user);
}
