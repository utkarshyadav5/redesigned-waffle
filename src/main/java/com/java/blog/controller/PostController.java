package com.java.blog.controller;

import com.java.blog.models.Post;
import com.java.blog.models.Tag;
import com.java.blog.service.AuthorService;
import com.java.blog.service.PostService;
import com.java.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private TagService tagService;

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> allPost(){
        List<Post> allPost = postService.findAll();
        return new ResponseEntity<List<Post>>(allPost, HttpStatus.OK);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        authorService.save(post.getAuthor());
        for(Tag tag : post.getTags()){
            tagService.save(tag);
        }
        postService.save(post);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }
}
