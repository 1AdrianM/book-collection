package com.book.collection.book.infrastructure.rest.controller;

import com.book.collection.book.infrastructure.Dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 import com.book.collection.book.application.Service.bookService;

import java.util.*;
@RestController
@RequestMapping("/api/v1/book")
public class bookController {
@Autowired
private final bookService bookService;

    public bookController(com.book.collection.book.application.Service.bookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/create")

    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<BookDto> PostBook(@RequestBody BookDto bookDto){
      return new ResponseEntity<>(bookService.createBook(bookDto),HttpStatus.CREATED);
    }

    @GetMapping("bookList")
    public ResponseEntity<List<BookDto>> retrieveBookList(){
    return new ResponseEntity<>(bookService.getBookList(), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<Optional<BookDto>> getBook(@PathVariable("id") int bookId ){
    return new ResponseEntity<>(bookService.getBook(bookId), HttpStatus.OK);
    }

    @PutMapping("/id")
    public ResponseEntity<BookDto> updateBook(@PathVariable("id") int bookId, @RequestBody BookDto bookDto){
        return new ResponseEntity<>(bookService.updateBook(bookId, bookDto), HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public String  deleteBook(@PathVariable("id") int bookId){
    bookService.deleteBook(bookId);
    return "Book removed";
    }
}
