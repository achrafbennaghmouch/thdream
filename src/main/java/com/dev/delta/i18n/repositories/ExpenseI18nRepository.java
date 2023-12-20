package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.ExpenseI18n;

public interface ExpenseI18nRepository extends JpaRepository<ExpenseI18n, Long> {

	ExpenseI18n findByLangI18n(String lang);

}
