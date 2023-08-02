package com.re.book.board.entity;



import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;

    @Column(length = 200)
    private String title;

    private Integer price;

    @CreationTimestamp
    private LocalDateTime insertDateTime;
}
