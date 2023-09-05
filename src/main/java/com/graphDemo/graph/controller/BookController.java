package com.graphDemo.graph.controller;

import com.graphDemo.graph.bookDetails.Author;
import com.graphDemo.graph.bookDetails.AuthorContactDetails;
import com.graphDemo.graph.bookDetails.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;


@Controller
@Slf4j
public class BookController {

    @QueryMapping
    public Book bookById(@Argument String id){
     log.info("Querying the book data for id {} ",id);
     return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book){
        log.info("Querying the author data for parent Book ");
        return Author.getById(book.getAuthorId());
    }

    @SchemaMapping
    public AuthorContactDetails contactDetails(Author author){
        log.info("Querying the contact data for parent Author");
        return  AuthorContactDetails.getById(author.getContactId());
    }
}
