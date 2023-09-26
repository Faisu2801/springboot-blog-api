package com.springboot.faisal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.faisal.blog.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
