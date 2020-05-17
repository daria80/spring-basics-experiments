package com.github.daria80.example6.services;

import com.github.daria80.example6.models.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);
    Book findById(int id);
    List<Book> findAll();
    void deleteById(int id);
}
