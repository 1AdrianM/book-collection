package com.book.collection.Service;

import com.book.collection.Dto.BookDto;
import com.book.collection.Models.Book;

import java.util.List;

public interface IBookService {
    BookDto createBook(Book book);
    List<BookDto> getAllBooks();
    BookDto updateBook(Book book);
    BookDto deleteBook(Book book);
}
