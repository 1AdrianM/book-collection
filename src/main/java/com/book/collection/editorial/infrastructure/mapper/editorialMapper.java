package com.book.collection.editorial.infrastructure.mapper;

import com.book.collection.editorial.domain.model.Editorial;
import com.book.collection.editorial.infrastructure.Dto.EditorialDto;

import static com.book.collection.book.infrastructure.mapper.bookMapper.BookDtoToEntity;

public class editorialMapper {
    public static Editorial DtoToEditorialEntity(EditorialDto editorialDto){
        return new Editorial().builder()
                .id(editorialDto.getId())
                .name(editorialDto.getName())
                .book(BookDtoToEntity(editorialDto.getBookDto()))

                        .build();

    }
}
