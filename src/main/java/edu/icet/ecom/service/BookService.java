package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.Book;
import edu.icet.ecom.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    final BookRepository bookRepository;

    public List<Book> getAllService() {
        return bookRepository.getAllBooks();
    }

    public String addMember(Book book) {
        return bookRepository.addBook(book);
    }
}
