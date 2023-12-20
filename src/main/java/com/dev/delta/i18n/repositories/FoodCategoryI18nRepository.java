package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.FoodCategoryI18n;

public interface FoodCategoryI18nRepository extends JpaRepository<FoodCategoryI18n, Long> {

	FoodCategoryI18n findByLangI18n(String lang);

}
