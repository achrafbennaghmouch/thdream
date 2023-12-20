package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CurrencyI18nRepository;
import com.dev.delta.repositories.CurrencyRepository;

@Service
public class CurrencyDTO implements DTO {

	@Autowired
	CurrencyRepository currencyRepository;

	@Autowired
	CurrencyI18nRepository currencyI18nRepository;

	@Override
	public void populate() {
		currency.setName("EUR");
		currency.setSymbol("DH");
		currencyRepository.save(currency);

		currencyI18n.setNameI18n("Name");
		currencyI18n.setSymbolI18n("Symbol");
		currencyI18n.setLangI18n("EN");
		currencyI18n.setGetAllTitleI18n("Currencies");
		currencyI18n.setCreateTitleI18n("Create");
		currencyI18n.setEditTitleI18n("Edit");
		currencyI18n.setGetTitleI18n("Currency");
		currencyI18nRepository.save(currencyI18n);

		currencyI18n2.setNameI18n("Name");
		currencyI18n2.setSymbolI18n("Symbol");
		currencyI18n2.setLangI18n("DE");
		currencyI18n2.setGetAllTitleI18n("Währungen");
		currencyI18n2.setCreateTitleI18n("Erstellen");
		currencyI18n2.setEditTitleI18n("Bearbeiten");
		currencyI18n2.setGetTitleI18n("Währung");
		currencyI18nRepository.save(currencyI18n2);

		currencyI18n3.setNameI18n("Nombre");
		currencyI18n3.setSymbolI18n("Símbolo");
		currencyI18n3.setLangI18n("ES");
		currencyI18n3.setGetAllTitleI18n("Monedas");
		currencyI18n3.setCreateTitleI18n("Crear");
		currencyI18n3.setEditTitleI18n("Editar");
		currencyI18n3.setGetTitleI18n("Moneda");
		currencyI18nRepository.save(currencyI18n3);

		currencyI18n4.setNameI18n("Nom");
		currencyI18n4.setSymbolI18n("Symbole");
		currencyI18n4.setLangI18n("FR");
		currencyI18n4.setGetAllTitleI18n("Devises");
		currencyI18n4.setCreateTitleI18n("Créer");
		currencyI18n4.setEditTitleI18n("Modifier");
		currencyI18n4.setGetTitleI18n("Devise");
		currencyI18nRepository.save(currencyI18n4);

		currencyI18n5.setNameI18n("الاسم");
		;
		currencyI18n5.setSymbolI18n("الرمز");
		currencyI18n5.setLangI18n("AR");
		currencyI18n5.setGetAllTitleI18n("العملات");
		currencyI18n5.setCreateTitleI18n("إنشاء");
		currencyI18n5.setEditTitleI18n("تحرير");
		currencyI18n5.setGetTitleI18n("العملة");
		currencyI18nRepository.save(currencyI18n5);

	}

}
