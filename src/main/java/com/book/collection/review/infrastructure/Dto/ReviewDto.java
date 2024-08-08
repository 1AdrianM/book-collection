package com.book.collection.review.infrastructure.Dto;


import com.book.collection.book.domain.model.Book;
import com.book.collection.book.infrastructure.Dto.BookDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {

    private int id;
    private String title;
    private String content;
    private int stars;
    private BookDto bookDto;
}
