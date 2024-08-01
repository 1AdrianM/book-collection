package com.book.collection.book.infrastructure.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

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
}
