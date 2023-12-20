package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.RoomType;
import com.dev.delta.repositories.RoomTypeRepository;

@Service
public class RoomTypeService {

	/**
	 * roomTypeRepository
	 */
	@Autowired
	private RoomTypeRepository roomTypeRepository;

	/**
	 * getRoomTypes
	 * 
	 * @return
	 */
	public List<RoomType> getRoomTypes() {
		return roomTypeRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return roomTypeRepository.count();
	}

	/**
	 * save
	 * 
	 * @param roomType
	 */
	public void save(RoomType roomType) {
		roomTypeRepository.save(roomType);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public RoomType findById(Long id) {
		return roomTypeRepository.findById(id).get();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		roomTypeRepository.delete(roomTypeRepository.findById(id).get());
	}
}
