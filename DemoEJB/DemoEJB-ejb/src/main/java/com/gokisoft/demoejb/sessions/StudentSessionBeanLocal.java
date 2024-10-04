/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.demoejb.sessions;

import com.gokisoft.demoejb.entities.Students;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Local
public interface StudentSessionBeanLocal {
    List<Students> getStudentList();
    void deleteStudent(String rollnumber);
}
