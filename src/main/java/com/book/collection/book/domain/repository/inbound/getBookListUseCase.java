package com.book.collection.book.domain.repository.inbound;

import com.book.collection.book.infrastructure.Dto.BookDto;

import java.util.List;

public interface getBookListUseCase {
    List<BookDto> getBookList();
}
