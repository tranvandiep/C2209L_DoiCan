/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author dieptv
 */
@Controller
public class BaseController {
    public String view(Model model, String viewName) {
        model.addAttribute("page", viewName);
        
        return "layout/master"; //-> View
    }
}
