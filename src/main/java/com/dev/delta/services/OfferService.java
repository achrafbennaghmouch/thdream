package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Offer;
import com.dev.delta.repositories.OfferRepository;

@Service
public class OfferService {

	@Autowired
	private OfferRepository offerRepository;

	/**
	 * getOffers
	 * 
	 * @return
	 */
	public List<Offer> getOffers() {
		return offerRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return offerRepository.count();
	}

	/**
	 * save
	 * 
	 * @param offer
	 */
	public void save(Offer offer) {
		offerRepository.save(offer);
	}

	public Offer findById(Long id) {
		return offerRepository.getById(id);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		offerRepository.deleteById(id);
	}
}
