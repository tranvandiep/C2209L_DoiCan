/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.gokisoft.test01.sessions;

import jakarta.ejb.Stateful;


/**
 *
 * @author dieptv
 */
@Stateful
public class Counter2SessionBean implements Counter2SessionBeanLocal {
    private int count = 0;
    
    @Override
    public int increments() {
        return ++count;
    }

}
