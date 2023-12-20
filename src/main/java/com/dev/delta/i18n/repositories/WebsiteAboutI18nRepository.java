package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteAboutI18n;

public interface WebsiteAboutI18nRepository extends JpaRepository<WebsiteAboutI18n, Long> {

	Object findByLang(String lang);

}
