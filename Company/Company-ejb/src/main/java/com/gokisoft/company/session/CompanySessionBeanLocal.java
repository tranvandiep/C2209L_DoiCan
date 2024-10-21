/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.company.session;

import com.gokisoft.company.entities.Company;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Local
public interface CompanySessionBeanLocal {
    List<Company> findAll();
    void insert(Company company);
    void update(Company company);
    void delete(int id);
    Company findById(int id);
}
