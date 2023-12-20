package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Gallery;
import com.dev.delta.repositories.GalleryRepository;

@Service
public class GalleryService {

	@Autowired
	GalleryRepository galleryRepository;

	public List<Gallery> getGalleries() {
		return galleryRepository.findAll();
	}

	public void save(Gallery gallery) {
		galleryRepository.save(gallery);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		galleryRepository.deleteById(id);
	}
}
