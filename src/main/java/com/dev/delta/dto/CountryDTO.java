package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CountryI18nRepository;
import com.dev.delta.repositories.CountryRepository;

@Service
public class CountryDTO implements DTO {

	@Autowired
	CountryRepository countryRepository;

	@Autowired
	CountryI18nRepository countryI18nRepository;

	@Override
	public void populate() {
		country.setName("France");
		countryRepository.save(country);

		countryI18n.setLangI18n("EN");
		countryI18n.setNameI18n("Name");
		countryI18n.setCreateTitleI18n("Create");
		countryI18n.setEditTitleI18n("Edit");
		countryI18n.setGetAllTitleI18n("Countries");
		countryI18n.setCreateTitleI18n("Create ");
		countryI18nRepository.save(countryI18n);

		countryI18n2.setLangI18n("DE");
		countryI18n2.setNameI18n("Land");
		countryI18n2.setCreateTitleI18n("Erstellen");
		countryI18n2.setEditTitleI18n("Bearbeiten");
		countryI18n2.setGetAllTitleI18n("Länder");
		countryI18n2.setCreateTitleI18n("Erstellen");
		countryI18nRepository.save(countryI18n2);

		countryI18n3.setLangI18n("FR");
		countryI18n3.setNameI18n("Nom");
		countryI18n3.setCreateTitleI18n("Créer");
		countryI18n3.setEditTitleI18n("Modifier le pays");
		countryI18n3.setGetAllTitleI18n("Pays");
		countryI18n3.setCreateTitleI18n("Créer");
		countryI18nRepository.save(countryI18n3);

		countryI18n4.setLangI18n("ES");
		countryI18n4.setNameI18n("Nombre");
		countryI18n4.setCreateTitleI18n("Crear");
		countryI18n4.setEditTitleI18n("Editar país");
		countryI18n4.setGetAllTitleI18n("Países");
		countryI18n4.setCreateTitleI18n("Crear");
		countryI18nRepository.save(countryI18n4);

		countryI18n5.setLangI18n("AR");
		countryI18n5.setNameI18n("الاسم");
		countryI18n5.setCreateTitleI18n("إنشاء دولة جديدة");
		countryI18n5.setEditTitleI18n("تعديل البلد");
		countryI18n5.setGetAllTitleI18n("البلدان");
		countryI18n5.setCreateTitleI18n("إنشاء دولة جديدة");
		countryI18nRepository.save(countryI18n5);

	}

}
