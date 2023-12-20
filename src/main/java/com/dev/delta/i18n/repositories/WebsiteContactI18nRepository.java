package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteContactI18n;

public interface WebsiteContactI18nRepository extends JpaRepository<WebsiteContactI18n, Long> {

	WebsiteContactI18n findByLang(String lang);

}
