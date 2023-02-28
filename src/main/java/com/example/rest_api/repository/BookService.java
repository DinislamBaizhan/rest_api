package com.example.rest_api.repository;

import com.example.rest_api.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(int id, Book bookDetails) {
        Book book;
        if (bookRepository.findById(id).isPresent()) {
            book = bookRepository.findById(id).get();
            book.setName(bookDetails.getName());
            book.setAuthor(bookDetails.getAuthor());
            book.setYearsOfPublishing(bookDetails.getYearsOfPublishing());
            return bookRepository.save(book);
        }
        else return null;
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public Book getById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }
}
