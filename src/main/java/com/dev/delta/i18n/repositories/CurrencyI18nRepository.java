package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.CurrencyI18n;

public interface CurrencyI18nRepository extends JpaRepository<CurrencyI18n, Long> {

	CurrencyI18n findByLangI18n(String lang);

}
