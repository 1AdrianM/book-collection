package com.book.collection.book.application.UseCase;

import com.book.collection.book.domain.repository.outbound.bookRepository;
import com.book.collection.book.domain.repository.inbound.getBookUseCase;
import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.Optional;

public class getBookUseCaseImpl implements  getBookUseCase {
    private final com.book.collection.book.domain.repository.outbound.bookRepository bookRepository;

    public getBookUseCaseImpl(com.book.collection.book.domain.repository.outbound.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<BookDto> getBook(int bookId) {
        return bookRepository.findBookById(bookId);
    }
}
