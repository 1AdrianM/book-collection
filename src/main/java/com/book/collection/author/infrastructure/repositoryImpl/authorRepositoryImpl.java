package com.book.collection.author.infrastructure.repositoryImpl;
import com.book.collection.author.domain.model.Author;
import com.book.collection.author.domain.repository.authorRepository;
import com.book.collection.author.infrastructure.Database.AuthorJpaRepository;
import com.book.collection.author.infrastructure.Dto.AuthorDto;

import java.util.List;

public class authorRepositoryImpl implements authorRepository{
    private final AuthorJpaRepository authorJpaRepository;

    public authorRepositoryImpl(AuthorJpaRepository authorJpaRepository) {
        this.authorJpaRepository = authorJpaRepository;
    }

    @Override
    public AuthorDto saveAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setName(authorDto.getName());
        Author savedAuthor = authorJpaRepository.save(author);
        AuthorDto authorResponse = new AuthorDto();
        authorResponse.setId(savedAuthor.getId());
        authorResponse.setName(savedAuthor.getName());
        return authorResponse;
    }

    @Override
    public List<AuthorDto> findAllAuthors() {
       List< Author> authorList = authorJpaRepository.findAll();
        return null;
        //authorList.stream().map()
    }

    @Override
    public AuthorDto findAuthorById(int authorId) {
        return null;
    }

    @Override
    public AuthorDto findAndUpdate(int authorId, AuthorDto authorDto) {
        return null;
    }

    @Override
    public void findAndDelete(int authorId) {

    }
}
