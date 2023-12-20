package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.repositories.ExpenseCategoryRepository;

@Service
public class ExpenseCategoryService {

	/**
	 * expenseCategoryRepository
	 */
	@Autowired
	private ExpenseCategoryRepository expenseCategoryRepository;

	/**
	 * getExpenseCategorys
	 * 
	 * @return
	 */
	public List<ExpenseCategory> getExpenseCategorys() {
		return expenseCategoryRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return expenseCategoryRepository.count();
	}

	/**
	 * save
	 * 
	 * @param expenseCategory
	 */
	public void save(ExpenseCategory expenseCategory) {
		expenseCategoryRepository.save(expenseCategory);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<ExpenseCategory> findById(long id) {
		return expenseCategoryRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		expenseCategoryRepository.delete(expenseCategoryRepository.findById(id).get());
	}
}
