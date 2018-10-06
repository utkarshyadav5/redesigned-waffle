package com.java.blog.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tags")
public class Tag {
    @Id
    private ObjectId tagId;
    private String name;

    public Tag(ObjectId tagId, String name) {
        this.tagId = tagId;
        this.name = name;
    }

    public String getTagId() {
        return tagId.toHexString();
    }

    public void setTagId(ObjectId tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
