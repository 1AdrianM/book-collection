package com.book.collection.book.domain.repository;

import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.List;

public interface bookRepository {
     BookDto createBook(BookDto bookDto);
     List<BookDto> findBooks();
     BookDto updateBook(int bookId, BookDto bookDto);
     BookDto findBookById(int bookId);
     void deleteBook (int id);
     boolean takeABook();

}
