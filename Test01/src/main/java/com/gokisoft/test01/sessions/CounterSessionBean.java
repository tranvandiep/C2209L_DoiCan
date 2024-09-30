/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.test01.sessions;

import jakarta.ejb.Stateless;

/**
 *
 * @author dieptv
 */
@Stateless
public class CounterSessionBean implements CounterSessionBeanLocal {
    private int count = 0;
    
    @Override
    public int increments() {
        return ++count;
    }
    
}
