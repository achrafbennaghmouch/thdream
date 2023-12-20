package com.dev.delta.entities;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String title;
	String body;
	String date;
	@Column(name = "TestName")
	String user;
	@Column(nullable = true, length = 64)
	private String photos;

	String day;
	String month;
	@ManyToOne
	@JoinColumn(name = "city_id")
	BlogCategory blogCategory;

	public BlogCategory getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(BlogCategory blogCategory) {
		this.blogCategory = blogCategory;
	}

	public Blog(String title, String body, String date, String user, String photos, String day, String month,
			BlogCategory blogCategory) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.user = user;
		this.photos = photos;
		this.day = day;
		this.month = month;
		this.blogCategory = blogCategory;
	}

	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public Blog(String title, String body, String date, String user) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.user = user;
	}

	@Transient
	public String getPhotosImagePath() {
		if (photos == null || id == null)
			return null;

		return "/photos/" + id + "/" + photos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
