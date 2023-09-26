package com.springboot.faisal.blog.service;

import java.util.List;

import com.springboot.faisal.blog.payload.PostDto;
import com.springboot.faisal.blog.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
