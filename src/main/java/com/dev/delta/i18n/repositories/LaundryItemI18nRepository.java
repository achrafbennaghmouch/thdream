package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.LaundryItemI18n;

public interface LaundryItemI18nRepository extends JpaRepository<LaundryItemI18n, Long> {

	LaundryItemI18n findByLangI18n(String lang);

}
