package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Room;
import com.dev.delta.repositories.RoomRepository;

@Service
public class RoomService {

	/**
	 * roomRepository
	 */
	@Autowired
	private RoomRepository roomRepository;

	/**
	 * getRooms
	 * 
	 * @return
	 */
	public List<Room> getRooms() {
		return roomRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return roomRepository.count();
	}

	/**
	 * save
	 * 
	 * @param room
	 */
	public void save(Room room) {
		roomRepository.save(room);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Room> findById(Long id) {
		return roomRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		roomRepository.delete(roomRepository.findById(id).get());
	}
}
