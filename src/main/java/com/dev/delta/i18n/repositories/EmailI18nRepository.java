package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.EmailI18n;

public interface EmailI18nRepository extends JpaRepository<EmailI18n, Long> {

	EmailI18n findByLangI18n(String lang);

}
