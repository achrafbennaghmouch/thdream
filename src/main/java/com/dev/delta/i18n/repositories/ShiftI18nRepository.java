package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.ShiftI18n;

public interface ShiftI18nRepository extends JpaRepository<ShiftI18n, Long> {

	ShiftI18n findByLangI18n(String lang);

}
