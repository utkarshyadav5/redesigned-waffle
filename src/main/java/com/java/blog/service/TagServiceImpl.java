package com.java.blog.service;

import com.java.blog.models.Tag;
import com.java.blog.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag findByTagId(String id) {
        return tagRepository.findByTagId(id);
    }

    @Override
    public Tag findByName(String name) {
        return tagRepository.findByName(name);
    }

    @Override
    public void save(Tag tag) {
        tagRepository.save(tag);
    }

    @Override
    public void delete(String id) {
        Tag tag = tagRepository.findByTagId(id);
        tagRepository.delete(tag);
    }
}
