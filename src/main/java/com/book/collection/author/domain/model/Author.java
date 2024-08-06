package com.book.collection.author.domain.model;

import com.book.collection.book.domain.model.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    //relacion uno a muchos con libros
    @OneToMany(mappedBy = "Author", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
