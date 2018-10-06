package com.java.blog.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="authors")
public class Author {
    @Id
    private ObjectId authorId;
    private String name;
    private String photo;

    public Author(ObjectId authorId, String name, String photo) {
        this.authorId = authorId;
        this.name = name;
        this.photo = photo;
    }

    public String getAuthorId() {
        return authorId.toHexString();
    }

    public void setAuthorId(ObjectId authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}