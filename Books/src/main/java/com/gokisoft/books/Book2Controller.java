/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books;

import com.gokisoft.books.models.Book;
import com.gokisoft.books.repos.ReposBook;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dieptv
 */
@Controller
@RequestMapping(value = "/book2")
public class Book2Controller extends BaseController{
    @Autowired
    private ReposBook reposBook;
    
    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("title", "Book Management");
        List<Book> dataList = reposBook.findAll();
        
        model.addAttribute("dataList", dataList);
        
        return view(model, "book2/index");
    }
    
    @GetMapping(value = "/input")
    public String input(Model model) {
        model.addAttribute("title", "Input Book");
        
        return view(model, "book2/input");
    }
    
    @PostMapping(value = "/input")
    public String post(@ModelAttribute Book book, Model model) {
        reposBook.save(book);
        
        return "redirect:/book2/index";
    }
    
    @GetMapping(value = "/edit")
    public String edit(Model model, @RequestParam(name = "id") Long id) {
        model.addAttribute("title", "Edit Book");
        
        Optional<Book> optionalBook = reposBook.findById(id);
        Book book = optionalBook.orElse(null);
        if(book == null) {
            return "redirect:/book2/index";
        }
        
        model.addAttribute("book", book);
        
        return view(model, "book2/edit");
    }
    
    @PostMapping(value = "/edit")
    public String update(@ModelAttribute Book book, Model model) {
        reposBook.save(book);
        
        return "redirect:/book2/index";
    }
    
    @GetMapping(value = "/delete")
    public String delete(Model model, @RequestParam(name = "id") Long id) {
        model.addAttribute("title", "Delete Book");
        
        Optional<Book> optionalBook = reposBook.findById(id);
        Book book = optionalBook.orElse(null);
        if(book == null) {
            return "redirect:/book2/index";
        }
        
        model.addAttribute("book", book);
        
        return view(model, "book2/delete");
    }
    
    @PostMapping(value = "/delete")
    public String confirmDelete(@ModelAttribute Book book, Model model) {
        reposBook.delete(book);
        
        return "redirect:/book2/index";
    }
}
