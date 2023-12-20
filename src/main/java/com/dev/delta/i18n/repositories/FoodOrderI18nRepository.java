package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.FoodOrderI18n;

public interface FoodOrderI18nRepository extends JpaRepository<FoodOrderI18n, Long> {

	FoodOrderI18n findByLangI18n(String lang);

}
