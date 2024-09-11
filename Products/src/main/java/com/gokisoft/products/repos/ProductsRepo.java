/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.products.repos;

import com.gokisoft.products.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dieptv
 */
public interface ProductsRepo extends JpaRepository<Products, Long>{
    //custom -> query -> tra ve du lieu theo cach rieng.
}
