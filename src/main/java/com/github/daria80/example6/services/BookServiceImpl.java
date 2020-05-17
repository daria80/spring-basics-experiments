package com.github.daria80.example6.services;

import com.github.daria80.example6.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    private final List<Book> books;

    @Autowired
    public BookServiceImpl(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book save(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public Book findById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public void deleteById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                return;
            }
        }
        System.err.println("Книги по id: " + id + " нет в библиотеке");
    }
}
