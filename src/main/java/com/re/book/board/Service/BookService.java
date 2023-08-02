package com.re.book.board.Service;



import org.springframework.stereotype.Service;

import com.re.book.board.dto.BookCreateDTO;

import java.awt.print.Book;


@Service
public class BookService {
    private BookRepositoty bookRepositoty;

    public BookService(BookRepositoty bookRepositoty) {
        this.bookRepositoty = bookRepositoty;
    }
    public Integer insert(BookCreateDTO bookCreateDTO) {
        Book book = Book.Builder()  //Bookbuilder에 객체생성
                        .title(bookCreateDTO.getTitle()) //타이틀에 데이터 세팅
                        .price(bookCreateDTO.getPrice()) //가격데이터에 세팅
                        .build(); //북 객체생성
        this.bookRepositoty.save(book);
        return book.getBookId();

    }
}
