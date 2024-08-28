/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books;

import com.gokisoft.books.models.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dieptv
 */
@Controller
//Route parent
@RequestMapping(value = "/book")
public class BookController {
    //Route child
    //Route = parent + child = /book/index
    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("title", "Book Management");
        model.addAttribute("index", 1);
        
        Book b = new Book("LAP TRINH C", 200000, "TRAN VAN A", "2012");
        model.addAttribute("book", b);
        
        List<Book> dataList = new ArrayList<>();
        dataList.add(b);
        dataList.add(b);
        dataList.add(b);
        dataList.add(b);
        dataList.add(b);
        
        model.addAttribute("dataList", dataList);
        
        return "book/index"; //-> View
    }
}
