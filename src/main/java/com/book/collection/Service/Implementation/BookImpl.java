package com.book.collection.Service.Implementation;

import com.book.collection.Dto.BookDto;
import com.book.collection.Models.Book;
import com.book.collection.Service.IBookService;

import java.util.List;

public class BookImpl implements IBookService {
    @Override
    public BookDto createBook(Book book) {
        return null;
    }

    @Override
    public List<BookDto> getAllBooks() {
        return List.of();
    }

    @Override
    public BookDto updateBook(Book book) {
        return null;
    }

    @Override
    public BookDto deleteBook(Book book) {
        return null;
    }
}
