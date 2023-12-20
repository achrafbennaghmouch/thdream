package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.DesignationI18n;

public interface DesignationI18nRepository extends JpaRepository<DesignationI18n, Long> {

	DesignationI18n findByLangI18n(String lang);

}
