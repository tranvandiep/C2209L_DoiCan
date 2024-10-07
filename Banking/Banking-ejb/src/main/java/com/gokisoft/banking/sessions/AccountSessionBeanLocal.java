/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.banking.sessions;

import com.gokisoft.banking.entities.Accounts;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Local
public interface AccountSessionBeanLocal {
    List<Accounts> getAccountList();
    void update(Accounts item);
    Accounts findById(int id);
}
