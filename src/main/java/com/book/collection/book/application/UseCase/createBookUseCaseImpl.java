package com.book.collection.book.application.UseCase;
import com.book.collection.book.domain.repository.inbound.createBookUseCase;
import com.book.collection.book.domain.repository.outbound.bookRepository;
import com.book.collection.book.infrastructure.Dto.BookDto;

public class createBookUseCaseImpl implements createBookUseCase {
    private final com.book.collection.book.domain.repository.outbound.bookRepository bookRepository;

    public createBookUseCaseImpl(com.book.collection.book.domain.repository.outbound.bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        return null;
    }
}
