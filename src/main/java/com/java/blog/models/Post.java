package com.java.blog.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection="posts")
public class Post {
    @Id
    private ObjectId postId;
    private String title;
    private String body;
    private Date dateCreated;
    private List<Tag> tags;
    private Author authorId;

    public Post(ObjectId postId, String title, String body, Date dateCreated, List<Tag> tags, Author authorId) {
        this.postId = postId;
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
        this.tags = tags;
        this.authorId = authorId;
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

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }
}
