/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books;

import com.gokisoft.books.models.Book;
import com.gokisoft.books.models.Message;
import com.gokisoft.books.repos.ReposBook;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dieptv
 */
@RestController
@RequestMapping(value = "/api/book")
public class ApiBookController {
    @Autowired
    private ReposBook reposBook;
    
    @GetMapping(value = "/list")
    public List<Book> list() {
        List<Book> dataList = reposBook.findAll();
        
        //model -> xem columns tra ve client -> Du an that -> lam theo cach nay.
        
        return dataList;
    }
    
    @PostMapping(value = "/add-form")
    public Message addForm(@Valid @ModelAttribute Book book) {
        reposBook.save(book);
        
        return new Message(200, "Success");
    }
    
//    @PostMapping(value = "/add")
//    public Message add(@RequestBody Book book) {
//        reposBook.save(book);
//        
//        return new Message(200, "Success");
//    }
    
    @PostMapping(value = "/save")
    public Message add(@RequestBody Book book) {
        reposBook.save(book);
        
        return new Message(200, "Success");
    }
    
//    @PostMapping(value = "/update")
//    public Message update(@RequestBody Book book) {
//        reposBook.save(book);
//        
//        return new Message(200, "Success");
//    }
    
    /**
     * Nghi tat ca cac TH co the xay ra -> implement -> OK nhat
     * @param book
     * @return 
     */
    @PutMapping(value = "/save")
    public Message update(@RequestBody Book book) {
        Optional<Book> optionalBook = reposBook.findById(book.getId());
        Book existBook = optionalBook.orElse(null);
        if(existBook == null) {
            return new Message(400, "Not found");
        }
        
        reposBook.save(book);
        
        return new Message(200, "Success");
    }
    
    @DeleteMapping(value = "/delete")
    public Message delete(@RequestBody Book book) {
        Optional<Book> optionalBook = reposBook.findById(book.getId());
        Book existBook = optionalBook.orElse(null);
        if(existBook == null) {
            return new Message(400, "Not found");
        }
        
        reposBook.delete(book);
        
        return new Message(200, "Success");
    }
}
