package com.java.blog.repository;

import com.java.blog.models.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author,String> {
    public Author findByAuthorId(String id);
    public Author findByName(String name);
}
