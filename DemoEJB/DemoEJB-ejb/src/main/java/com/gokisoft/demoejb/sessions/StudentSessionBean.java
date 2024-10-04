/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.demoejb.sessions;

import com.gokisoft.demoejb.controllers.StudentsJpaController;
import com.gokisoft.demoejb.controllers.exceptions.NonexistentEntityException;
import com.gokisoft.demoejb.entities.Students;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dieptv
 */
@Stateless
public class StudentSessionBean implements StudentSessionBeanLocal {
    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
    private final StudentsJpaController controller = new StudentsJpaController(factory);
//    private final EntityManagerFactory factory;
//    private final StudentsJpaController controller;
//    
//    public StudentSessionBean() {
//        factory = Persistence.createEntityManagerFactory("my_persistence_unit");
//        controller = new StudentsJpaController(factory);
//    }
    
    @Override
    public List<Students> getStudentList() {
        return controller.findStudentsEntities();
    }

    @Override
    public void deleteStudent(String rollnumber) {
        try {
            controller.destroy(rollnumber);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(StudentSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
