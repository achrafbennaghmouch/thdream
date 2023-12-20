package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.DepartementI18n;

public interface DepartementI18nRepository extends JpaRepository<DepartementI18n, Long> {

	DepartementI18n findByLangI18n(String lang);

}
