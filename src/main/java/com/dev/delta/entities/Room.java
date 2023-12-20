package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String RoomNo;
	String Floor;
	@ManyToOne
	@JoinColumn(name = "room_type_id")
	RoomType RoomType;
	String Status;
	String bookedStatus = "Available";
	String description;

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public String getBookedStatus() {
		return bookedStatus;
	}

	public void setBookedStatus(String bookedStatus) {
		this.bookedStatus = bookedStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room(String roomNo, String floor, RoomType roomType, String status) {
		super();
		RoomNo = roomNo;
		Floor = floor;
		RoomType = roomType;
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(String roomNo) {
		RoomNo = roomNo;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public RoomType getRoomType() {
		return RoomType;
	}

	public void setRoomType(RoomType roomType) {
		RoomType = roomType;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
