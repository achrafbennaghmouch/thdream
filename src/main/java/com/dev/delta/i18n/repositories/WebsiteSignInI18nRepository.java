package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteSignInI18n;

public interface WebsiteSignInI18nRepository extends JpaRepository<WebsiteSignInI18n, Long> {

	WebsiteSignInI18n findByLang(String lang);

}
