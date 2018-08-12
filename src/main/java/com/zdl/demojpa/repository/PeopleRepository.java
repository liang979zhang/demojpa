package com.zdl.demojpa.repository;

import com.zdl.demojpa.entity.Book;
import com.zdl.demojpa.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Long> {
    Book findByName(String name);

}
