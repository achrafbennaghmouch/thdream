package com.dev.delta.i18n.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.i18n.entities.PaymentMethodI18n;

public interface PaymentMethodI18nRepository extends JpaRepository<PaymentMethodI18n, Long> {

	PaymentMethodI18n findByLangI18n(String lang);

}
