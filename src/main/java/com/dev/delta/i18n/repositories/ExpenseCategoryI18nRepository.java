package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.ExpenseCategoryI18n;

public interface ExpenseCategoryI18nRepository extends JpaRepository<ExpenseCategoryI18n, Long> {

	ExpenseCategoryI18n findByLangI18n(String lang);

}
