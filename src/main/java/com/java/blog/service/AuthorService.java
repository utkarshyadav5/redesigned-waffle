package com.java.blog.service;

import com.java.blog.models.Author;

public interface AuthorService {
    public Author findByAuthorId(String id);
    public Author findByName(String name);

    public void save(Author author);
    public void delete(String id);
}
