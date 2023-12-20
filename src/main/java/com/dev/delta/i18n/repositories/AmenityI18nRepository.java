package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.AmenityI18n;

public interface AmenityI18nRepository extends JpaRepository<AmenityI18n, Long> {

	AmenityI18n findByLanguageI18n(String languageI18n);;

}
