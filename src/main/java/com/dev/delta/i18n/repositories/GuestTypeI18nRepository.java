package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.GuestTypeI18n;

public interface GuestTypeI18nRepository extends JpaRepository<GuestTypeI18n, Long> {

	GuestTypeI18n findByLangI18n(String lang);

}
