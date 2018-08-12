package com.zdl.demojpa.repository;

import com.zdl.demojpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByName(String name);

    List<Book> findByNameContaining(String name);
}
