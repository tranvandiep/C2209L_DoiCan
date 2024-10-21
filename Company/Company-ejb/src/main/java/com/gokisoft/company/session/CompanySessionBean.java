/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.company.session;

import com.gokisoft.company.controller.CompanyJpaController;
import com.gokisoft.company.controller.exceptions.NonexistentEntityException;
import com.gokisoft.company.entities.Company;
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
public class CompanySessionBean implements CompanySessionBeanLocal {
    private EntityManagerFactory factory;
    private CompanyJpaController controller;
    
    private void connect() {
        factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        controller = new CompanyJpaController(factory);
    }
    
    @Override
    public List<Company> findAll() {
        connect();
        
        return controller.findCompanyEntities();
    }

    @Override
    public void insert(Company company) {
        connect();
        controller.create(company);
    }

    @Override
    public void update(Company company) {
        connect();
        try {
            controller.edit(company);
        } catch (Exception ex) {
            Logger.getLogger(CompanySessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        connect();
        try {
            controller.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CompanySessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Company findById(int id) {
        connect();
        
        Company company = controller.findCompany(id);
        return company;
    }
    
}
