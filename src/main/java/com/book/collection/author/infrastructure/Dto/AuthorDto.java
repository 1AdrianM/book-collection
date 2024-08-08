package com.book.collection.author.infrastructure.Dto;

import com.book.collection.book.domain.model.Book;
import com.book.collection.book.infrastructure.Dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorDto {

    private int Id;
    private String name;
    private List<Book> books = new ArrayList<>();

}
