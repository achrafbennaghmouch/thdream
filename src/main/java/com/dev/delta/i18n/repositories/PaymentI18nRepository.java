package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.PaymentI18n;

public interface PaymentI18nRepository extends JpaRepository<PaymentI18n, Long> {

	PaymentI18n findByLangI18n(String lang);

}
