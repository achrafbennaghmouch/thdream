package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.RoomI18n;

public interface RoomI18nRepository extends JpaRepository<RoomI18n, Long> {

	RoomI18n findByLangI18n(String lang);

}
