package com.graphDemo.graph.bookDetails;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Book {
    private String id;
    private String name;
    private int pageCount;
    private String authorId;



    private Date releaseDate;

    public Book (String id, String name , int pageCount, String authorId) {
        this.id = id;
        this.name= name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Mahabharat", 4000, "author-4"),
            new Book("book-2", "katyani", 300,"author-2"),
            new Book("book-3", "ram charit manas", 2000, "author-3")
    );

    public  static Book getById(String id ){
        return books.stream()
                .filter( book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}