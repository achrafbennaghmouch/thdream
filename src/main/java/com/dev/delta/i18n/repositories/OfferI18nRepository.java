package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.OfferI18n;

public interface OfferI18nRepository extends JpaRepository<OfferI18n, Long> {

	OfferI18n findByLangI18n(String lang);

}
