package com.book.collection.book.domain.repository.outbound;


import com.book.collection.author.infrastructure.Dto.AuthorDto;
import com.book.collection.book.infrastructure.Dto.BookDto;
import com.book.collection.editorial.infrastructure.Dto.EditorialDto;

import java.util.List;
import java.util.Optional;

public interface bookRepository {
    BookDto saveBook(BookDto bookDto);
    List<BookDto> findAllBook();
    BookDto findAndUpdateBook(int bookId, BookDto bookDto);
    Optional<BookDto> findBookById(int bookId);
    void findAndDeleteBookById (int id);
    boolean takeABook();

}
