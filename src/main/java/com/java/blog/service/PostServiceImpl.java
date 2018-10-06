package com.java.blog.service;

import com.java.blog.models.Post;
import com.java.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> findByTags(String tag) {
        return postRepository.findByTags(tag);
    }

    @Override
    public List<Post> findByAuthorId(String id) {
        return postRepository.findByAuthorId(id);
    }

    @Override
    public Post findByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    @Override
    public Post findByPostId(String id) {
        return postRepository.findByPostId(id);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(String id) {
        Post post = postRepository.findByPostId(id);
        postRepository.delete(post);
    }
}
