package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteMenuI18n;

public interface WebsiteMenuI18nRepository extends JpaRepository<WebsiteMenuI18n, Long> {

	WebsiteMenuI18n findByLang(String lang);
}
