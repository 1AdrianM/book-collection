package com.book.collection.book.infrastructure.mapper;

import com.book.collection.book.domain.model.Book;
import com.book.collection.book.infrastructure.Dto.BookDto;

public class bookMapper {

    public static Book BookDtoToEntity(BookDto bookDto){
        return new Book().builder()
                .bookId(bookDto.getBookId())
                .bookTitle(bookDto.getBookTitle())
                .genre(bookDto.getGenre())
                .description(bookDto.getDescription())
                .Edition(bookDto.getEdition())
                .coverImage(bookDto.getCoverImage())
                .publishedDate(bookDto.getPublishedDate())
                .isAvailable(bookDto.getIsAvailable())
                .relevance(bookDto.getRelevance())
                .build();
    }
    public static BookDto BookEntityToDto(Book book){
        return new BookDto().builder()
                .bookId(book.getBookId())
                .bookTitle(book.getBookTitle())
                .genre(book.getGenre())
                .description(book.getDescription())
                .Edition(book.getEdition())
                .coverImage(book.getCoverImage())
                .publishedDate(book.getPublishedDate())
                .isAvailable(book.getIsAvailable())
                .relevance(book.getRelevance())
                .build();
    }
}
