package com.book.collection.book.application.Service;

import com.book.collection.book.domain.repository.inbound.getBookListUseCase;
import com.book.collection.book.domain.repository.inbound.*;
import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.List;
import java.util.Optional;

public class bookService implements
        createBookUseCase,
        deleteBookUseCase,
        getBookListUseCase,
        getBookUseCase,
        updateBookUseCase{
   private final createBookUseCase createBookUseCase;
    private final deleteBookUseCase deleteBookUseCase;
    private final getBookListUseCase getBookListUseCase;
    private final getBookUseCase getBookUseCase;
    private final updateBookUseCase updateBookUseCase;

    public bookService(com.book.collection.book.domain.repository.inbound.createBookUseCase createBookUseCase, com.book.collection.book.domain.repository.inbound.deleteBookUseCase deleteBookUseCase, com.book.collection.book.domain.repository.inbound.getBookListUseCase getBookListUseCase, com.book.collection.book.domain.repository.inbound.getBookUseCase getBookUseCase, com.book.collection.book.domain.repository.inbound.updateBookUseCase updateBookUseCase) {
        this.createBookUseCase = createBookUseCase;
        this.deleteBookUseCase = deleteBookUseCase;
        this.getBookListUseCase = getBookListUseCase;
        this.getBookUseCase = getBookUseCase;
        this.updateBookUseCase = updateBookUseCase;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public List<BookDto> getBookList() {
        return List.of();
    }

    @Override
    public Optional<BookDto> getBook(int bookId) {
        return Optional.empty();
    }

    @Override
    public BookDto updateBook(int bookId, BookDto bookDto) {
        return null;
    }
}
