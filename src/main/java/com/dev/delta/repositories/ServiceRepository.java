package com.dev.delta.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

	Optional<Service> findById(int id);

	List<Service> findByCheckin(CheckIn checkin);

}
