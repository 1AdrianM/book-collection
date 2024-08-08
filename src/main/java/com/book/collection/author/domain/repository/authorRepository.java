package com.book.collection.author.domain.repository;

import com.book.collection.author.infrastructure.Dto.AuthorDto;

import java.util.List;

public interface authorRepository {
    AuthorDto saveAuthor(AuthorDto authorDto);
    List<AuthorDto> findAllAuthors();
    AuthorDto findAuthorById(int authorId);
   AuthorDto findAndUpdate(int authorId, AuthorDto authorDto);
    void findAndDelete(int authorId);

}
