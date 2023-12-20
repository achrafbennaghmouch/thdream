package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ServiceRepository;

@Service
public class ServiceService {

	/**
	 * serviceRepository
	 */
	@Autowired
	private ServiceRepository serviceRepository;

	/**
	 * getServices
	 * 
	 * @return
	 */
	public List<com.dev.delta.entities.Service> getServices() {
		return serviceRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return serviceRepository.count();
	}

	/**
	 * save
	 * 
	 * @param service
	 */
	public void save(com.dev.delta.entities.Service service) {
		serviceRepository.save(service);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<com.dev.delta.entities.Service> findById(int id) {
		return serviceRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		serviceRepository.delete(serviceRepository.findById(id).get());
	}
}
