package com.java.blog.repository;

import com.java.blog.models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag,String> {
    
}
