package com.book.collection.book.infrastructure.Database;

import com.book.collection.book.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<Book, Integer> {
}
