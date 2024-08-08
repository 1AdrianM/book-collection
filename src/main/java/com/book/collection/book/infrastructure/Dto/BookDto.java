package com.book.collection.book.infrastructure.Dto;

import com.book.collection.author.infrastructure.Dto.AuthorDto;
import com.book.collection.editorial.infrastructure.Dto.EditorialDto;
import com.book.collection.review.infrastructure.Dto.ReviewDto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    public int bookId;
    public String bookTitle;
    public String description;
    public String genre;
    public String coverImage;
    public int relevance;
    public Date publishedDate;
    public String Edition;
    public Boolean isAvailable;
   public List<ReviewDto> reviewDtoList = new ArrayList<>();
   public AuthorDto authorDto;
   public EditorialDto editorialDto;
}
