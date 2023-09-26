package com.springboot.faisal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.faisal.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
