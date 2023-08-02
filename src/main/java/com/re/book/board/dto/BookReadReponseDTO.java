package com.re.book.board.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class BookReadReponseDTO {


    private Integer Bookid;
    private String title;
    private Integer price;
    private LocalDateTime insertDateTime;

    public BookReadReponseDTO fromBook(Book book) {
        this.bookid = book.getBookid();
        this.title=book.getTitle();
        
    }


}
