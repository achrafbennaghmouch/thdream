package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.UIHeaderI18n;

public interface UIHeaderI18nRepository extends JpaRepository<UIHeaderI18n, Long> {

	UIHeaderI18n findByLang(String lang);
}
