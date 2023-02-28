package com.example.rest_api.controller;

import com.example.rest_api.entity.Book;
import com.example.rest_api.repository.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
    }
    @GetMapping("/books/{id}")
    public Book getById(@PathVariable("id") int id) {
        return bookService.getById(id);
    }
}
