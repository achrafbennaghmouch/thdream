package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}
