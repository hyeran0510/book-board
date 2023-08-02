package com.re.book.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BookCreateDTO {
    @NonNull
    private String title;

    @NonNull  //반드시 값이 있어야 됨
    private Integer price;
}
