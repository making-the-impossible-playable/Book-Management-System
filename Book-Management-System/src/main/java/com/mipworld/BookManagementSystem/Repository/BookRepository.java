package com.mipworld.BookManagementSystem.Repository;

import com.mipworld.BookManagementSystem.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//intermediary between application and database( or other data source) Abstracts the details of data access focused on data persistence operations like data saved or retrieved
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
