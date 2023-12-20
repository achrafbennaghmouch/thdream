package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Subscriber;
import com.dev.delta.repositories.SubscriberRepository;

@Service
public class SubscriberService {

	@Autowired
	private SubscriberRepository subcriberRepository;

	/**
	 * getSubcribers
	 * 
	 * @return
	 */
	public List<Subscriber> getSubcribers() {
		return subcriberRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return subcriberRepository.count();
	}

	/**
	 * save
	 * 
	 * @param subcriber
	 */
	public void save(Subscriber subcriber) {
		subcriberRepository.save(subcriber);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		subcriberRepository.deleteById(id);
	}

}
