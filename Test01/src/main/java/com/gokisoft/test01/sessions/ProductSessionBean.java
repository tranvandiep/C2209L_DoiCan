/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.gokisoft.test01.sessions;

import com.gokisoft.test01.controllers.ProductsJpaController;
import com.gokisoft.test01.entities.Products;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author dieptv
 */
@Stateless
public class ProductSessionBean implements ProductSessionBeanLocal {
    //Lay danh sach san pham ra
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
    ProductsJpaController controller = new ProductsJpaController(factory);

    @Override
    public List<Products> findProductsEntities() {
        return controller.findProductsEntities();
    }
}
