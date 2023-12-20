package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.InformationHotelI18n;

public interface InformationI18nRepository extends JpaRepository<InformationHotelI18n, Long> {

	InformationHotelI18n findByLangI18n(String lang);

	InformationHotelI18n findByLang(String lang);

}
