package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.ExtraBedI18n;

public interface ExtraBedI18nRepository extends JpaRepository<ExtraBedI18n, Long> {

	ExtraBedI18n findByLangI18n(String lang);

}
