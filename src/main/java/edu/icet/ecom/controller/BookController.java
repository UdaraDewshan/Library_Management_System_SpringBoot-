package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.Book;
import edu.icet.ecom.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    final BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.getAllService();
    }



}
