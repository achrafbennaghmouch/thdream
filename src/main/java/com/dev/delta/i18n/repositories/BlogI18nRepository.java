package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.BlogI18n;

public interface BlogI18nRepository extends JpaRepository<BlogI18n, Long> {

	BlogI18n findByLangI18n(String lang);

}
