package com.book.collection.book.domain.repository.inbound;

import com.book.collection.book.infrastructure.Dto.BookDto;

public interface updateBookUseCase {
    BookDto updateBook(int bookId, BookDto bookDto);
}
