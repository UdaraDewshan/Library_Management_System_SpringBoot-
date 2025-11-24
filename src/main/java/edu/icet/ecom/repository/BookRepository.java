package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtillBook;
import edu.icet.ecom.model.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookRepository {

    Session session = HibernateUtillBook.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    public List<Book> getAllBooks(){
        return session.createQuery("from Book", Book.class).list();
    }

    public String addBook(Book book) {
        try {
            session.persist(book);
            transaction.commit();
            return "add book success";
        } catch (Exception e) {
            transaction.rollback();
            return "something when wrong";
        }finally {
            session.close();
        }
    }


    public String removeBook(String id) {
        try {
            session.remove(session.find(Book.class, id));
            transaction.commit();
            return "Book Remove Success";
        } catch (Exception e) {
            transaction.rollback();
            return "something when wrong";
        }finally {
            session.close();
        }
    }

    public Book searchBook(String id) {
        return session.find(Book.class, id);
    }
}
