/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gokisoft.books.repos;

import com.gokisoft.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dieptv
 */
public interface ReposBook extends JpaRepository<Book, Long>{
    //custom -> query -> tra ve du lieu theo cach rieng.
}
