package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.CheckInI18n;

public interface CheckInI18nRepository extends JpaRepository<CheckInI18n, Long> {

	CheckInI18n findByLangI18n(String lang);

	CheckInI18n findByLanguageI18(String languageI18);

}
