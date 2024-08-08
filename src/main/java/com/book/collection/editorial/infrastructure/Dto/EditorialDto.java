package com.book.collection.editorial.infrastructure.Dto;


import com.book.collection.book.domain.model.Book;
import com.book.collection.book.infrastructure.Dto.BookDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditorialDto {

    private int id;
    private String name;
    private BookDto bookDto;
}