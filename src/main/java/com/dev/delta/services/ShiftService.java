package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Shift;
import com.dev.delta.repositories.ShiftRepository;

@Service
public class ShiftService {

	/**
	 * shiftRepository
	 */
	@Autowired
	private ShiftRepository shiftRepository;

	/**
	 * getShifts
	 * 
	 * @return
	 */
	public List<Shift> getShifts() {
		return shiftRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return shiftRepository.count();
	}

	/**
	 * save
	 * 
	 * @param shift
	 */
	public void save(Shift shift) {
		shiftRepository.save(shift);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Shift> findById(long id) {
		return shiftRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		shiftRepository.delete(shiftRepository.findById(id).get());
	}
}
