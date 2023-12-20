package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.UserI18n;

public interface UserI18nRepository extends JpaRepository<UserI18n, Long> {

	UserI18n findByLangI18n(String lang);

}
