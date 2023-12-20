package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.RoomType;

public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
	Optional<RoomType> findById(Long id);
}
