package com.re.book.board.controller;

import com.re.book.board.Service.BookService;
import com.re.book.board.dto.BookCreateDTO;
import com.re.book.board.dto.BookReadReponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.NoSuchElementException;

@Controller
public class controller {

    @Autowired
    private BookService bookService;

    @GetMapping("/create")
    public String create() {
        return "book/create";
    }


    @PostMapping("/book/create")
    public String insert(BookCreateDTO bookCreateDTO) {
        Integer BookId = this.bookService.insert(bookCreateDTO);
        return String.format("redirect:/book/read/%s", bookid);
    }

    @GetMapping("/book/read/{bookId}")
    public ModelAndView read(@PathVariable Integer boodId) {
        ModelAndView modelAndView = new ModelAndView();

        try {
            BookReadReponseDTO bookReadReponseDTO = this.bookService.read(boodId);
            modelAndView.addObject("bookReadReponseDTO", bookReadReponseDTO);
            modelAndView.setViewName("book/read");
        } catch (NoSuchElementException ex) {
            modelAndView.setStatus(HttpStatus.UNPROCESSABLE_ENTITY);
            modelAndView.addObject("Message", "책 정보가 없습니다.");
            modelAndView.addObject("location", "/book");
            modelAndView.setViewName("common/error/422");
        }
        return modelAndView;
    }
}





