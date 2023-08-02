package com.re.book.board.controller;

import com.re.book.board.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Autowired
    private BookService bookService;

    @GetMapping("/create")
    public String create(){
        return "book/create";
    }


    @ResponseBody
    public String main() {

        return "아름아 엉엉 이제야 된다... ㅜㅜ";
    }
}
