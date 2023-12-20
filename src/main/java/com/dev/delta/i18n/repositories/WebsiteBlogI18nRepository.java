package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteBlogI18n;

public interface WebsiteBlogI18nRepository extends JpaRepository<WebsiteBlogI18n, Long> {

	WebsiteBlogI18n findByLang(String lang);

}
