package com.github.daria80.example6.configs;

import com.github.daria80.example6.models.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RepositoryConfig {

    @Bean
    public List<Book> books() {
        return new ArrayList<>();
    }
}
