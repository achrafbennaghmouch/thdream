package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.HouseKeepingOrderI18n;

public interface HouseKeepingOrderI18nRepository extends JpaRepository<HouseKeepingOrderI18n, Long> {

	HouseKeepingOrderI18n findByLangI18n(String lang);

}
