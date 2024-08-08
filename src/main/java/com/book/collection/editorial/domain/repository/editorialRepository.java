package com.book.collection.editorial.domain.repository;

import com.book.collection.author.infrastructure.Dto.AuthorDto;
import com.book.collection.editorial.infrastructure.Dto.EditorialDto;

import java.util.List;

public interface editorialRepository {
    EditorialDto saveEditorial(EditorialDto editorialDto);
    List<AuthorDto> findAllEditorial();
    AuthorDto findEditorialById(int editorialId);
    AuthorDto findAndUpdateEditorial(int authorId, EditorialDto editorialDto);
    void findAndDeleteEditorial(int editorialId);

}
