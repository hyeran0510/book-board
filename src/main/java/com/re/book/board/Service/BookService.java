package com.re.book.board.Service;

import com.re.book.board.dto.BookCreateDTO;
import com.re.book.board.dto.BookReadReponseDTO;
import com.re.book.board.entity.Bookrepository;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.NoSuchElementException;


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
    public BookReadReponseDTO read(Integer bookId) throws NoSuchElementException {
        Book book = this.bookRepository.findBy(bookId).orElseThrow();
        BookReadReponseDTO bookReadReponseDTO = new BookReadReponseDTO();
        bookReadReponseDTO.fromBook(book);
        return bookReadReponseDTO;
    }
}



