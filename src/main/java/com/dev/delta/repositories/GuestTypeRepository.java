package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.GuestType;

public interface GuestTypeRepository extends JpaRepository<GuestType, Long> {
	Optional<GuestType> findById(int id);
}
