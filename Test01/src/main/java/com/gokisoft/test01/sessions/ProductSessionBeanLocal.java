/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.gokisoft.test01.sessions;

import com.gokisoft.test01.entities.Products;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Local
public interface ProductSessionBeanLocal {
    List<Products> findProductsEntities();
}
