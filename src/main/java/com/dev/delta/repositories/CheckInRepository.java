package com.dev.delta.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.CheckIn;
import com.dev.delta.entities.Customer;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
	Optional<CheckIn> findById(int id);

	List<CheckIn> findByCutomer(Customer cutomer);
}
