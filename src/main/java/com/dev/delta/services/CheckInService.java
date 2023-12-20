package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;
import com.dev.delta.repositories.CheckInRepository;

@Service
public class CheckInService {

	/**
	 * checkInRepository
	 */
	@Autowired
	private CheckInRepository checkInRepository;

	/**
	 * getCheckIns
	 * 
	 * @return
	 */
	public List<CheckIn> getCheckIns() {
		return checkInRepository.findAll();
	}

	public List<CheckIn> getCheckInByCustomer(Customer customer) {
		return checkInRepository.findByCutomer(customer);
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return checkInRepository.count();
	}

	/**
	 * save
	 * 
	 * @param checkIn
	 */
	public CheckIn save(CheckIn checkIn) {
		return checkInRepository.save(checkIn);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public CheckIn findById(Long id) {
		return checkInRepository.findById(id).get();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		checkInRepository.delete(checkInRepository.findById(id).get());
	}
}
