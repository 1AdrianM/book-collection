package com.book.collection.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int bookId;
    public String bookTitle;
    public String description;
    public String genre;
    public String coverImage;
    public int relevance;
    public Date publishedDate;
    public String Edition;
    public Boolean isAvailable;


    //relationships

}
