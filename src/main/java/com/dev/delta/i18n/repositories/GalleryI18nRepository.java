package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.GalleryI18n;

public interface GalleryI18nRepository extends JpaRepository<GalleryI18n, Long> {

	GalleryI18n findByLangI18n(String lang);

}
