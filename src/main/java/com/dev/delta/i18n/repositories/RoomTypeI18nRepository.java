package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.RoomTypeI18n;

public interface RoomTypeI18nRepository extends JpaRepository<RoomTypeI18n, Long> {

	RoomTypeI18n findByLangI18n(String lang);

}
