package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {
	Optional<Designation> findById(int id);
}
