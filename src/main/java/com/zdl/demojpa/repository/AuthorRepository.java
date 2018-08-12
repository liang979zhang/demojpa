package com.zdl.demojpa.repository;

import com.zdl.demojpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author ,Integer> {

    Author findByName(String name);

    List<Author> findByNameContaining(String name);
}
