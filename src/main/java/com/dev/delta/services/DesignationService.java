package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Designation;
import com.dev.delta.repositories.DesignationRepository;

@Service
public class DesignationService {

	/**
	 * designationRepository
	 */
	@Autowired
	private DesignationRepository designationRepository;

	/**
	 * getDesignations
	 * 
	 * @return
	 */
	public List<Designation> getDesignations() {
		return designationRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return designationRepository.count();
	}

	/**
	 * save
	 * 
	 * @param designation
	 */
	public void save(Designation designation) {
		designationRepository.save(designation);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Designation> findById(long id) {
		return designationRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		designationRepository.delete(designationRepository.findById(id).get());
	}
}
