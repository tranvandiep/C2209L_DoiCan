/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.demoejb.sessions;

import jakarta.ejb.Stateless;

/**
 *
 * @author dieptv
 */
@Stateless
public class TestSessionBean implements TestSessionBeanLocal {
    private int count = 0;
    
    @Override
    public String getMessage() {
        return "Hello > " + (++count);
    }

}
