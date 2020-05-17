package com.github.daria80.example6.controllers;

import com.github.daria80.example6.models.Book;
import com.github.daria80.example6.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Bean
    public Boolean demo() {
        bookService.save(new Book(1, "Java", "Shildt"));
        bookService.save(new Book(2, "Concurrency", "Unknown"));

        System.out.println(bookService.findAll());

        System.out.println(bookService.findById(2));

        bookService.deleteById(1);

        System.out.println(bookService.findAll());

        bookService.deleteById(1);
        return true;
    }


}
