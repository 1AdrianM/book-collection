package com.book.collection.book.domain.repository.inbound;

import com.book.collection.book.infrastructure.Dto.BookDto;

public interface createBookUseCase {
    BookDto createBook(BookDto bookDto);
}
