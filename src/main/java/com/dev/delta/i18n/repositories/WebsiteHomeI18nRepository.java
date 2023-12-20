package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteHomeI18n;

public interface WebsiteHomeI18nRepository extends JpaRepository<WebsiteHomeI18n, Long> {

	WebsiteHomeI18n findByLang(String lang);

}
