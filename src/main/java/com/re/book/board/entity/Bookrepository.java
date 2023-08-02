package com.re.book.board.entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book, Integer> {
}
