package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.EmployeeI18n;

public interface EmployeeI18nRepository extends JpaRepository<EmployeeI18n, Long> {

	EmployeeI18n findByLangI18n(String lang);

}
