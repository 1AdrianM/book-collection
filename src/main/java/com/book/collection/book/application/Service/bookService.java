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
//private final authorRepository authorRepository;
//private final editorialRepository editorialRepository;
    public bookService(createBookUseCase createBookUseCase,deleteBookUseCase deleteBookUseCase,getBookListUseCase getBookListUseCase, getBookUseCase getBookUseCase, updateBookUseCase updateBookUseCase) {
        this.createBookUseCase = createBookUseCase;
        this.deleteBookUseCase = deleteBookUseCase;
        this.getBookListUseCase = getBookListUseCase;
        this.getBookUseCase = getBookUseCase;
        this.updateBookUseCase = updateBookUseCase;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {

        return createBookUseCase.createBook(bookDto);
    }

    @Override
    public void deleteBook(int bookId) {
   deleteBookUseCase.deleteBook(bookId);
    }

    @Override
    public List<BookDto> getBookList() {
        return getBookListUseCase.getBookList();
    }

    @Override
    public Optional<BookDto> getBook(int bookId) {
        return getBookUseCase.getBook(bookId);
    }

    @Override
    public BookDto updateBook(int bookId, BookDto bookDto) {
        return updateBookUseCase.updateBook(bookId, bookDto);
    }
}
