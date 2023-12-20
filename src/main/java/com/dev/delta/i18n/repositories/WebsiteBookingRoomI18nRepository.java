package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.WebsiteBookingRoomI18n;

public interface WebsiteBookingRoomI18nRepository extends JpaRepository<WebsiteBookingRoomI18n, Long> {

	WebsiteBookingRoomI18n findByLangI18n(String langI18n);
}
