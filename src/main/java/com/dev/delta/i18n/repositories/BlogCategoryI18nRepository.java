package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.BlogCategoryI18n;

public interface BlogCategoryI18nRepository extends JpaRepository<BlogCategoryI18n, Long> {

	BlogCategoryI18n findByLangI18n(String lang);

}
