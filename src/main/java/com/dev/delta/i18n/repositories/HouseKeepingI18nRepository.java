package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;

public interface HouseKeepingI18nRepository extends JpaRepository<HouseKeepingRequestI18n, Long> {

	HouseKeepingRequestI18n findByLangI18n(String lang);

}
