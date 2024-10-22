package com.kishi.BookApplication.service;

import com.kishi.BookApplication.entity.Book;

import com.kishi.BookApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class BookService {
    @Autowired
     private BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book geetBookByName(String name){
       Book bookByTitle = bookRepository.findBookByTitle(name);
       return bookByTitle;
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllbook(){
       return bookRepository.findAll();
    }

    public String deleteBook(Integer id){
        bookRepository.deleteById(id);
        return "deleted Successfully";
    }
}
