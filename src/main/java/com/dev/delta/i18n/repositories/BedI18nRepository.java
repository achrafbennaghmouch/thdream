package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.BedI18n;

public interface BedI18nRepository extends JpaRepository<BedI18n, Long> {

	BedI18n findByLangI18n(String lang);

}
