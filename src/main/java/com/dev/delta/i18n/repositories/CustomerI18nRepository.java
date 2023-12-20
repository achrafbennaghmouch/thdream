package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.CustomerI18n;

public interface CustomerI18nRepository extends JpaRepository<CustomerI18n, Long> {

	CustomerI18n findByLangI18n(String lang);

}
