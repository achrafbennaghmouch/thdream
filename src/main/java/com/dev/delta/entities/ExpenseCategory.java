package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpenseCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String CategoryName;
	String Status;

	public ExpenseCategory() {
		// TODO Auto-generated constructor stub
	}

	public ExpenseCategory(String categoryName, String status) {
		super();
		CategoryName = categoryName;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
