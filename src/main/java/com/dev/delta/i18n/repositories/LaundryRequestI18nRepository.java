package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.LaundryRequestI18n;

public interface LaundryRequestI18nRepository extends JpaRepository<LaundryRequestI18n, Long> {

	LaundryRequestI18n findByLangI18n(String lang);

}
