/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.products;

import com.gokisoft.products.entities.Products;
import com.gokisoft.products.repos.ProductsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dieptv
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductsRepo productRepo;
    
    @GetMapping(value = "/index")
    public String index(Model model) {
        List<Products> dataList = productRepo.findAll();
        
        model.addAttribute("dataList", dataList);
        
        return "products/index";
    }
}
