package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.ExtraBedRequestI18n;

public interface ExtraBedRequestI18nRepository extends JpaRepository<ExtraBedRequestI18n, Long> {

	ExtraBedRequestI18n findByLangI18n(String lang);

}
