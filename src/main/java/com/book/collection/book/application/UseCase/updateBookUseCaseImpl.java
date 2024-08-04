package com.book.collection.book.application.UseCase;

import com.book.collection.book.domain.repository.inbound.updateBookUseCase;
import com.book.collection.book.domain.repository.outbound.bookRepository;
import com.book.collection.book.infrastructure.Dto.BookDto;

public class updateBookUseCaseImpl implements updateBookUseCase {
    private final com.book.collection.book.domain.repository.outbound.bookRepository bookRepository;

    public updateBookUseCaseImpl(com.book.collection.book.domain.repository.outbound.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDto updateBook(int bookId, BookDto bookDto) {
        return bookRepository.findAndUpdateBook(bookId, bookDto);
    }
}
