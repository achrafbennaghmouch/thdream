package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.GuestType;
import com.dev.delta.repositories.GuestTypeRepository;

@Service
public class GuestTypeService {

	/**
	 * guestTypeRepository
	 */
	@Autowired
	private GuestTypeRepository guestTypeRepository;

	/**
	 * getGuestTypes
	 * 
	 * @return
	 */
	public List<GuestType> getGuestTypes() {
		return guestTypeRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return guestTypeRepository.count();
	}

	/**
	 * save
	 * 
	 * @param guestType
	 */
	public void save(GuestType guestType) {
		guestTypeRepository.save(guestType);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<GuestType> findById(long id) {
		return guestTypeRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		guestTypeRepository.delete(guestTypeRepository.findById(id).get());
	}
}
