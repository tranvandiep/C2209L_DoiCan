/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.test01.sessions;

import jakarta.ejb.Local;

/**
 *
 * @author dieptv
 */
@Local
public interface CounterSessionBeanLocal {
    int increments();
}
