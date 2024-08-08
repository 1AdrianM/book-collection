package com.book.collection.editorial.infrastructure.repositoryImpl;

import com.book.collection.author.infrastructure.Dto.AuthorDto;
import com.book.collection.editorial.domain.repository.editorialRepository;
import com.book.collection.editorial.infrastructure.Dto.EditorialDto;

import java.util.List;

public class editorialRepositoryImpl implements editorialRepository {

    @Override
    public EditorialDto saveEditorial(EditorialDto editorialDto) {
        return null;
    }

    @Override
    public List<AuthorDto> findAllEditorial() {
        return List.of();
    }

    @Override
    public AuthorDto findEditorialById(int editorialId) {
        return null;
    }

    @Override
    public AuthorDto findAndUpdateEditorial(int authorId, EditorialDto editorialDto) {
        return null;
    }

    @Override
    public void findAndDeleteEditorial(int editorialId) {

    }
}
