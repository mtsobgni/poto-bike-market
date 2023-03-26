package fr.market.poto.api.service;

import fr.market.poto.api.dao.BookDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Book getBookById(Integer book_id){
        Optional<Book> result = bookDao.findById(book_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public Book saveBook(Book book) {
        return bookDao.save(book);
    }

    public Book updateBook(Book updateBook){
        Book book = bookDao.findById(updateBook.getId()).get();
        if(book != null){
            book = bookDao.save(updateBook);
        }
        return book;
    }

    public void deleteBook(Integer book_id) {
        if (bookDao.findById(book_id).get() != null) {
            bookDao.deleteById(book_id);
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}