package com.java.blog.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection="posts")
public class Post {
    @Id
    private ObjectId postId;

    @Indexed(unique=true)
    private String title;
    private String body;
    private Date dateCreated;
    @DBRef
    @Field("tags")
    private List<Tag> tags;
    @DBRef
    @Field("authors")
    private Author author;

    public Post() {
    }

    public Post(String title, String body, Date dateCreated, List<Tag> tags, Author author) {
        this.postId = new ObjectId();
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
        this.tags = tags;
        this.author = author;
    }

    public String getPostId() {
        return postId.toHexString();
    }

    public void setPostId(ObjectId postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
