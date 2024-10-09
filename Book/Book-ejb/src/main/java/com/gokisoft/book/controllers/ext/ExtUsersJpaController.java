/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.book.controllers.ext;

import com.gokisoft.book.controllers.UsersJpaController;
import com.gokisoft.book.entities.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author dieptv
 */
public class ExtUsersJpaController extends UsersJpaController{
    public ExtUsersJpaController(EntityManagerFactory emf) {
        super(emf);
    }
    
    public Users login(String email, String password) {
        Users user;
        
        EntityManager em = getEntityManager();
        Query query = em.createNamedQuery("Users.findByEmail", Users.class);
        query.setParameter("email", email);
        
        List<Users> dataList = query.getResultList();
        if(dataList.isEmpty()) return null;
        
        user = dataList.get(0);
        
        if(user.getPassword().equals(password)) {
            return user;
        }
        
        return null;
    }
}
