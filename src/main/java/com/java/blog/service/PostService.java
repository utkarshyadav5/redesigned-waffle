package com.java.blog.service;

import com.java.blog.models.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public List<Post> findByTags(String tag);
    public List<Post> findByAuthorId(String id);
    public Post findByTitle(String title);
    public Post findByPostId(String id);

    public void save(Post post);
    public void delete(String id);
}
