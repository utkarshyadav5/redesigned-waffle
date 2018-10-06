package com.java.blog.service;

import com.java.blog.models.Tag;

public interface TagService {
    public Tag findByTagId(String id);
    public Tag findByName(String name);

    public void save(Tag tag);
    public void delete(String id);
}
