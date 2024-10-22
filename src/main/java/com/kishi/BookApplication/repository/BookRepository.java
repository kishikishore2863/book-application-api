package com.kishi.BookApplication.repository;

import com.kishi.BookApplication.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    public Book findBookByTitle(String title);


}
