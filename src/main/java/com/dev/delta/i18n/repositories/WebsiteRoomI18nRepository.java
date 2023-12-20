package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteRoomI18n;

public interface WebsiteRoomI18nRepository extends JpaRepository<WebsiteRoomI18n, Long> {

	WebsiteRoomI18n findByLang(String lang);

}
