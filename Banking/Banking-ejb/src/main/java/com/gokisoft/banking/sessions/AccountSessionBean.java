/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.banking.sessions;

import com.gokisoft.banking.controllers.AccountsJpaController;
import com.gokisoft.banking.entities.Accounts;
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
public class AccountSessionBean implements AccountSessionBeanLocal {
    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
    private final AccountsJpaController controller = new AccountsJpaController(factory);

    @Override
    public List<Accounts> getAccountList() {
        return controller.findAccountsEntities();
    }

    @Override
    public void update(Accounts item) {
        try {
            controller.edit(item);
        } catch (Exception ex) {
            Logger.getLogger(AccountSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Accounts findById(int id) {
        return controller.findAccounts(id);
    }
}
