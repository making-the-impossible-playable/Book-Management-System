package com.mipworld.BookManagementSystem;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // an entity class represents a table in the database. My book entity will store book information, such as the title, author, genre, and year
public class Book {
    //encapsulation
    @Id private Long id; //id annotation marks this as the primary key for the table
    private String title;
    private String author;
    private String genre;
    private Integer publishYear;
}
