package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteFooterI18n;

public interface WebsiteFooterI18nRepository extends JpaRepository<WebsiteFooterI18n, Long> {

	WebsiteFooterI18n findByLang(String lang);

}
