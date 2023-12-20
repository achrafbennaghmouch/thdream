package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.BlogCategory;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory, Long> {

}
