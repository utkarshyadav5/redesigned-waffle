package com.java.blog.repository;

import com.java.blog.models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag,String> {
    public Tag findByTagId(String id);
    public Tag findByName(String name);
}
