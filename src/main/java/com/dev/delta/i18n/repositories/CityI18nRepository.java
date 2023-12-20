package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.CityI18n;

public interface CityI18nRepository extends JpaRepository<CityI18n, Long> {

	CityI18n findByLangI18n(String langI18n);
}
