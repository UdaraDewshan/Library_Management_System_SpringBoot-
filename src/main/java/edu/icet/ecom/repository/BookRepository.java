package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtillBook;
import edu.icet.ecom.model.entity.Book;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookRepository {

    Session session = HibernateUtillBook.getSessionFactory().openSession();

    public List<Book> getAllBooks(){
        return session.createQuery("from Book", Book.class).list();
    }
}
