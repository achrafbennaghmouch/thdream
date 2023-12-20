package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.FoodI18n;

public interface FoodI18nRepository extends JpaRepository<FoodI18n, Long> {

	FoodI18n findByLangI18n(String lang);

}
