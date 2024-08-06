package com.book.collection.book.domain.model;

import com.book.collection.author.domain.model.Author;
import com.book.collection.editorial.domain.model.Editorial;
import com.book.collection.review.domain.model.Review;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    //relationships uno a uno con usuario, muchos a uno con autor y uno a uno con editorial
    @OneToMany(mappedBy = "Book", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Review> reviews = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author-id")
    private Author author;
    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private Editorial editorial;



}
