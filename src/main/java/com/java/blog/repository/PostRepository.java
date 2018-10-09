package com.java.blog.repository;

import com.java.blog.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
    public List<Post> findAll();
    public List<Post> findByTags(String tag);
    public List<Post> findByAuthor(String id);
    public Post findByTitle(String title);
    public Post findByPostId(String id);
}
