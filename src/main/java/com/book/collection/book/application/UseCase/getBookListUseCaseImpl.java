package com.book.collection.book.application.UseCase;

import com.book.collection.book.domain.repository.outbound.bookRepository;
import com.book.collection.book.domain.repository.inbound.getBookListUseCase;
import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.List;

public class getBookListUseCaseImpl implements getBookListUseCase{
    private final com.book.collection.book.domain.repository.outbound.bookRepository bookRepository;

    public getBookListUseCaseImpl(com.book.collection.book.domain.repository.outbound.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> getBookList() {
        return List.of();
    }
}
