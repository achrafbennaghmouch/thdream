package com.dev.delta.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String type;
	@Column(name = "start_time")
	String start;
	@Column(name = "end_time")
	String end;

	public Shift() {
		// TODO Auto-generated constructor stub
	}

	public Shift(String type, String start, String end) {
		super();
		this.type = type;
		this.start = start;
		this.end = end;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
