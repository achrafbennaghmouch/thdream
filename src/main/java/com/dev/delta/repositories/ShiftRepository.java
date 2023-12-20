package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Long> {
	Optional<Shift> findById(int id);
}
