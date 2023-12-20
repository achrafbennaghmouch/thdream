package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Customer;
import com.dev.delta.entities.User;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findById(Long id);

	Customer findByUser(User user);
}
