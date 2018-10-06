package com.java.blog.service;

import com.java.blog.models.Author;
import com.java.blog.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author findByAuthorId(String id) {
        return authorRepository.findByAuthorId(id);
    }

    @Override
    public Author findByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void delete(String id) {
        Author author = authorRepository.findByAuthorId(id);
        authorRepository.delete(author);
    }
}
