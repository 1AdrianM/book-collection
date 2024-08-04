package com.book.collection.book.infrastructure.spring.config;
import com.book.collection.book.application.Service.bookService;
import com.book.collection.book.application.UseCase.*;
import com.book.collection.book.domain.repository.inbound.*;
import com.book.collection.book.domain.repository.outbound.*;
import com.book.collection.book.infrastructure.Database.BookJpaRepository;

import com.book.collection.book.domain.repository.outbound.bookRepository;

import com.book.collection.book.infrastructure.repositoryImpl.bookRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bookAppConfig {

@Bean
public bookService bookService(
        bookRepository bookRepository) {
    return new bookService(
            new createBookUseCaseImpl(bookRepository),
            new deleteBookUseCaseImpl(bookRepository),
            new getBookListUseCaseImpl(bookRepository),
            new getBookUseCaseImpl(bookRepository),
                    new updateBookUseCaseImpl(bookRepository));
}
    @Bean
    public bookRepository bookRepository(BookJpaRepository BookJpaRepository ){
        return new bookRepositoryImpl(BookJpaRepository);
    }
}
