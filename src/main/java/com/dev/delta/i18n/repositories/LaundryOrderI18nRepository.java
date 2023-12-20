package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.LaundryOrderI18n;

public interface LaundryOrderI18nRepository extends JpaRepository<LaundryOrderI18n, Long> {

	LaundryOrderI18n findByLangI18n(String lang);

}
