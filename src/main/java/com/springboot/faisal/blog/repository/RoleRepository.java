package com.springboot.faisal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.faisal.blog.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
