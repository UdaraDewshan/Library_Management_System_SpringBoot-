package edu.icet.ecom.controller;

import edu.icet.ecom.model.entity.Book;
import edu.icet.ecom.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        return bookService.addMember(book);
    }

    @GetMapping("/remove={id}")
    public String removeBook(@PathVariable String id){
        return bookService.removeBook(id);
    }

    @GetMapping("/search={id}")
    public Book searchBook(@PathVariable String id){
        return bookService.searchBook(id);
    }

}
