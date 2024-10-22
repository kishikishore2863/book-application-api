package com.kishi.BookApplication.controller;

import com.kishi.BookApplication.entity.Book;
import com.kishi.BookApplication.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/v1")
public class BookController {
     private BookService bookService;


     @Autowired
     public BookController(BookService bookService){
         this.bookService=bookService;
     }

     @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook/{name}")
    public ResponseEntity<Book>getBook(@PathVariable("name") String name){
         Book getBook =bookService.geetBookByName( name);
         return ResponseEntity.ok(getBook);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
         Book updatedBook = bookService.updateBook(book);
         return ResponseEntity.ok(updatedBook);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAllBook(){
      List<Book> books =   bookService.getAllbook();
      return ResponseEntity.ok(books);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> deleteBook(@PathVariable("id") Integer id){
        String delete = bookService.deleteBook(id);
        return ResponseEntity.ok(delete);
    }
}
