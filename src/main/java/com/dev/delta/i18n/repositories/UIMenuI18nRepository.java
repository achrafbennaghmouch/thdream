package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.UIMenuI18n;

public interface UIMenuI18nRepository extends JpaRepository<UIMenuI18n, Long> {

	UIMenuI18n findByLang(String lang);
}
