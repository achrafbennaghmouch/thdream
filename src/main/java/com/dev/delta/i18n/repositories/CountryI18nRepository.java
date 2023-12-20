package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.CountryI18n;

public interface CountryI18nRepository extends JpaRepository<CountryI18n, Long> {

	CountryI18n findByLangI18n(String lang);

}
