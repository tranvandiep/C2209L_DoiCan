/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books;

import com.gokisoft.books.models.Book;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dieptv
 */
@Controller
//Route parent
@RequestMapping(value = "/book")
public class BookController extends BaseController{
    //Route child
    //Route = parent + child = /book/index
    @GetMapping(value = "/index")
    public String index(Model model, HttpSession session) {
        model.addAttribute("title", "Book Management");
        ArrayList<Book> dataList = new ArrayList<>();
        if(session.getAttribute("bookList") != null) {
            dataList = (ArrayList<Book>) session.getAttribute("bookList");
        }
        
        model.addAttribute("dataList", dataList);
//        model.addAttribute("page", "book/index");
//        
//        return "layout/master"; //-> View
        return view(model, "book/index");
    }
    
    @GetMapping(value = "/input")
    public String oldinput(Model model) {
        model.addAttribute("title", "Add Book");
//        model.addAttribute("page", "book/input");
//        
//        return "layout/master"; //-> View
        return view(model, "book/input");
    }
    
    //Route child
    //Route = parent + child = /book/index
    @GetMapping(value = "/old/index")
    public String oldindex(Model model, HttpSession session) {
        model.addAttribute("title", "Book Management");
//        model.addAttribute("index", 1);
        
//        Book book = new Book();
//        if(session.getAttribute("book") != null) {
//            book = (Book) session.getAttribute("book");
//        }
//        model.addAttribute("book", book);
//        
//        Book b = new Book("LAP TRINH C", 200000, "TRAN VAN A", "2012");
//        
//        List<Book> dataList = new ArrayList<>();
//        dataList.add(b);
//        dataList.add(b);
//        dataList.add(b);
//        dataList.add(b);
//        dataList.add(b);
        ArrayList<Book> dataList = new ArrayList<>();
        if(session.getAttribute("bookList") != null) {
            dataList = (ArrayList<Book>) session.getAttribute("bookList");
        }
        
        model.addAttribute("dataList", dataList);
        
        return "bookold/index"; //-> View
    }
    
    @GetMapping(value = "/old/input")
    public String oldinput() {
        return "bookold/input";
    }
    
//    @PostMapping(value = "/input")
//    public String processForm(@ModelAttribute Book book, Model model) {
//        model.addAttribute("index", 1);
//        model.addAttribute("book", book);
//        
//        return "book/detail";
//    }
    @PostMapping(value = "/input")
    public String processForm(@ModelAttribute Book book, HttpSession session) {
        ArrayList<Book> bookList = new ArrayList<>();
        if(session.getAttribute("bookList") != null) {
            bookList = (ArrayList<Book>) session.getAttribute("bookList");
        }
        bookList.add(book);
        session.setAttribute("bookList", bookList);
        
        return "redirect:/book/index";
    }
}
