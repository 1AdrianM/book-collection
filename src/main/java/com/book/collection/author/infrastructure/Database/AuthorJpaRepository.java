package com.book.collection.author.infrastructure.Database;
import com.book.collection.author.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJpaRepository extends JpaRepository<Author, Integer> {
}
