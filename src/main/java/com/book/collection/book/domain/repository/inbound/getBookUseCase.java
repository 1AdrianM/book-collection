package com.book.collection.book.domain.repository.inbound;

import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.Optional;

public interface getBookUseCase {
    Optional<BookDto> getBook(int bookId);
}
