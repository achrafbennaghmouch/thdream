package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.FoodRequestI18n;

public interface FoodRequestI18nRepository extends JpaRepository<FoodRequestI18n, Long> {

	FoodRequestI18n findByLangI18n(String lang);

}
