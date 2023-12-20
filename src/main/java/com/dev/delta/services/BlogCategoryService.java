package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.BlogCategory;
import com.dev.delta.repositories.BlogCategoryRepository;

@Service
public class BlogCategoryService {

	@Autowired
	private BlogCategoryRepository blogRepository;

	/**
	 * getFoods
	 * 
	 * @return
	 */
	public List<BlogCategory> getBlogCategories() {
		return blogRepository.findAll();
	}

	public BlogCategory save(BlogCategory blog) {
		return blogRepository.save(blog);
	}

	public BlogCategory findById(Long id) {
		// TODO Auto-generated method stub
		return blogRepository.getById(id);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		blogRepository.deleteById(id);
	}

}
