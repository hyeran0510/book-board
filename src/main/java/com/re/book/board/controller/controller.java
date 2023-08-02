package com.re.book.board.controller;

import com.re.book.board.Service.BookService;
import com.re.book.board.dto.BookCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @Autowired
    private BookService bookService;

    @GetMapping("/create")
    public String create(){
        return "book/create";
    }


    @PostMapping("/book/create")
    public String insert(BookCreateDTO bookCreateDTO) {

    }




}
