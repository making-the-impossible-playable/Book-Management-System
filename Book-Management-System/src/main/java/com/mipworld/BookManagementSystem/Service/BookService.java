package com.mipworld.BookManagementSystem.Service;

import com.mipworld.BookManagementSystem.Book;
import com.mipworld.BookManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//this service class contains the core logic of the application crud operations
@Service // tells spring to treat this as a spring managed bean
public class BookService {
    @Autowired //dependency inject to inject objects that the class needs. Reduces tight coupling between components
    private BookRepository bookRepository;

    //add new book to table
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    //get a list of all the book objects
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    //optional is used to avoid returning null, this returns an optional type book
    public Optional<Book> getBookById(Long id){
    return bookRepository.findById(id);
    }
    //delete book by id, is void so returns nothing
    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }

}
