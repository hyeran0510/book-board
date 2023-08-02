package com.re.book.board.Service;

import com.re.book.board.dto.BookCreateDTO;
import com.re.book.board.entity.Bookrepository;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.awt.print.Book;


@Builder
@Service

public class BookService {
    private Bookrepository bookRepository;

    public BookService(Bookrepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Integer insert(BookCreateDTO bookCreateDTO) {
        Book book = book.builder()
                        .title(bookCreateDTO.getTitle())
                        .price(bookCreateDTO.getPrice())
                        .build();
        this.bookRepository.save(book);
        return book.getbookid();
    }
}

