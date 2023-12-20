package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.SubscriberI18n;

public interface SubscriberI18nRepository extends JpaRepository<SubscriberI18n, Long> {
	SubscriberI18n findByLangI18n(String langI18n);
}
