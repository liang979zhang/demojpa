package com.zdl.demojpa;

import com.zdl.demojpa.entity.Book;
import com.zdl.demojpa.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTests {

    @Autowired
    private BookRepository bookRepository;


//    @Before
    public void init() {

        Book bookA = new Book("Spring in Action");
        Book bookB = new Book("Spring Boot in Action");
        Book bookC = new Book("Spring Data in Action");
//        bookRepository.save(bookA);
        bookRepository.saveAll(Arrays.asList(bookA, bookB, bookC));
    }

    @Test
    public void deleteAll() {
        bookRepository.deleteAll();
    }


    @Test
    public void findAll() {
        List<Book> all = bookRepository.findAll();
        for (Book a : all) {
            System.out.println(a.getName());
        }
    }


    @Test
    public void add() {
        Book bookA = new Book("Spring in Action");
        Book bookB = new Book("Spring Boot in Action");
        Book bookC = new Book("Spring Data in Action");
        bookRepository.saveAll(Arrays.asList(bookA, bookB, bookC));
    }



}
