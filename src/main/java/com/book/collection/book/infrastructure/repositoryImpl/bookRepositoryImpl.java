package com.book.collection.book.infrastructure.repositoryImpl;
import com.book.collection.book.domain.model.Book;
import com.book.collection.book.domain.repository.bookRepository;
import com.book.collection.book.infrastructure.Dto.BookDto;
import com.book.collection.book.infrastructure.mapper.bookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.book.collection.book.infrastructure.Database.BookJpaRepository;
import java.util.List;
import java.util.stream.Collectors;

import static com.book.collection.book.infrastructure.mapper.bookMapper.BookEntityToDto;

public class bookRepositoryImpl implements bookRepository {
    @Autowired
    private final BookJpaRepository bookRepo;

    public bookRepositoryImpl(BookJpaRepository bookRepo) {

        this.bookRepo = bookRepo;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book = new Book();
                book.setBookId(bookDto.getBookId());
                book.setBookTitle(bookDto.getBookTitle());
                book.setGenre(bookDto.getGenre());
                book.setDescription(bookDto.getDescription());
                book.setEdition(bookDto.getEdition());
                book.setCoverImage(bookDto.getCoverImage());
                book.setPublishedDate(bookDto.getPublishedDate());
                book.setIsAvailable(bookDto.getIsAvailable());
                book.setRelevance(bookDto.getRelevance());


 Book savedBook  = bookRepo.save(book);
 BookDto bookResponse = new BookDto();
        bookResponse.setBookId(savedBook.getBookId());
        bookResponse.setBookTitle(savedBook.getBookTitle());
        bookResponse.setGenre(savedBook.getGenre());
        bookResponse.setDescription(savedBook.getDescription());
        bookResponse.setEdition(savedBook.getEdition());
        bookResponse.setCoverImage(savedBook.getCoverImage());
        bookResponse.setPublishedDate(savedBook.getPublishedDate());
        bookResponse.setIsAvailable(savedBook.getIsAvailable());
        bookResponse.setRelevance(savedBook.getRelevance());
return bookResponse;
    }
    @Override
    public List<BookDto> findBooks() {
        List <Book> books =bookRepo.findAll();
return books.stream().map(bookMapper::BookEntityToDto).collect(Collectors.toList());
    }

    @Override
    public BookDto updateBook(int bookId, BookDto bookDto) {
        Book book= bookRepo.findById(bookId).orElseThrow(null);
        book.setBookTitle(bookDto.getBookTitle());
        book.setGenre(bookDto.getGenre());
        book.setEdition(bookDto.getEdition());
        book.setRelevance(bookDto.getRelevance());
        book.setCoverImage(bookDto.getCoverImage());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setDescription(bookDto.getDescription());

        Book updatedBook = bookRepo.save(book);
        return BookEntityToDto(updatedBook);
    }

    @Override
    public BookDto findBookById(int bookId) {
        Book book= bookRepo.findById(bookId).orElseThrow(null);
        return BookEntityToDto(book);
    }

    @Override
    public void deleteBook(int id) {
        Book book= bookRepo.findById(id).orElseThrow(null);
     bookRepo.delete(book);
    }

    @Override
    public boolean takeABook() {
        return false;
    }
}
