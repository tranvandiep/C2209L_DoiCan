/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.book.sessions;

import com.gokisoft.book.controllers.ext.ExtUsersJpaController;
import com.gokisoft.book.entities.Users;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author dieptv
 */
@Stateless
public class UsersSessionBean implements UsersSessionBeanLocal {
    private final EntityManagerFactory factory;
    private final ExtUsersJpaController controller;
    
    public UsersSessionBean() {
        factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        controller = new ExtUsersJpaController(factory);
    }

    @Override
    public Users login(String email, String password) {
        Users user = controller.login(email, password);
        
        return user;
    }

    @Override
    public void register(Users user) {
        controller.create(user);
    }

}
