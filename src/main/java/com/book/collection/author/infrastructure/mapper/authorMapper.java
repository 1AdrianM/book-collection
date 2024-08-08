package com.book.collection.author.infrastructure.mapper;

import com.book.collection.author.domain.model.Author;
import com.book.collection.author.infrastructure.Dto.AuthorDto;
import com.book.collection.book.domain.model.Book;
import com.book.collection.book.infrastructure.Dto.BookDto;

import static com.book.collection.book.infrastructure.mapper.bookMapper.BookDtoToEntity;

public class authorMapper {
// correct types later
    public static Author DtoToAuthorEntity(AuthorDto authorDto){
        return new Author().builder()
                .name(authorDto.getName())
                .books(authorDto.getBooks())
                .id(authorDto.getId())
                .build();
    }
}
