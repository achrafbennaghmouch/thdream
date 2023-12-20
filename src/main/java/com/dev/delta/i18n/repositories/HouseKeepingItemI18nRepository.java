package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.HouseKeepingItemI18n;

public interface HouseKeepingItemI18nRepository extends JpaRepository<HouseKeepingItemI18n, Long> {

	HouseKeepingItemI18n findByLangI18n(String lang);

}
