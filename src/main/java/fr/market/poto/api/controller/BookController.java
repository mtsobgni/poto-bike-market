package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.BookApiMapper;
import fr.market.poto.api.controller.model.BookRequest;
import fr.market.poto.api.model.Book;
import fr.market.poto.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookApiMapper bookApiMapper;

    @GetMapping(value = "/bookId", produces = "application/json")
    public Book getBook(Integer bookId){
        return bookService.getBookById(bookId);
    }

    @PostMapping(value = "/saveBook", produces = "application/json")
    public Book saveBook(@Valid @RequestBody BookRequest bookRequest){
        return bookService.saveBook(bookApiMapper.convertArticleRequest(bookRequest));
    }

    @PutMapping(value = "/updateBook", produces = "application/json")
    public Book updateBook (Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping(value = "/deleteBook", produces = "application/json")
    public void deleteBook (Integer id){
        bookService.deleteBook(id);
    }
}