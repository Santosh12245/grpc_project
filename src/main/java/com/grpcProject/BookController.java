
package com.grpcProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    public BookService bookService;

    @GetMapping("/getbook")
    public BookResponse call() {
        try {
            bookService.getBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        BookResponse book = null;
        return book;
    }
}

