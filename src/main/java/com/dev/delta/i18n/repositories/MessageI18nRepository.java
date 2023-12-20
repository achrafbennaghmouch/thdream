package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.MessageI18n;

public interface MessageI18nRepository extends JpaRepository<MessageI18n, Long> {

	MessageI18n findByLangI18n(String lang);

}
