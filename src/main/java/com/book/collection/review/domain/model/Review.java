package com.book.collection.review.domain.model;

import com.book.collection.book.domain.model.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private int stars;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book-id")
    private Book book;
}
