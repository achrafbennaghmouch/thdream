package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CityI18nRepository;
import com.dev.delta.repositories.CityRepository;

@Service
public class CityDTO implements DTO {

	@Autowired
	CityRepository cityRepository;

	@Autowired
	CityI18nRepository cityI18nRepository;

	@Override
	public void populate() {
		city.setName("Paris");
		cityRepository.save(city);

		cityI18n.setLangI18n("EN");
		cityI18n.setNameI18n("Name");
		cityI18n.setGetAllTitleI18n("Cities");
		cityI18n.setCreateTitleI18n("Create");
		cityI18n.setEditTitleI18n("Edit");
		cityI18n.setGetTitleI18n("City");
		cityI18n.setCreateTitleI18n("Create");
		cityI18n.setEditTitleI18n("Edit");
		cityI18n.setGetAllTitleI18n("Cities");
		cityI18nRepository.save(cityI18n);

		cityI18n2.setGetAllTitleI18n("Städte");
		cityI18n2.setCreateTitleI18n("Erstellen");
		cityI18n2.setEditTitleI18n("Bearbeiten");
		cityI18n2.setGetTitleI18n("Städte");
		cityI18n2.setLangI18n("DE");
		cityI18n2.setNameI18n("Name");

		cityI18nRepository.save(cityI18n2);

		cityI18n3.setLangI18n("AR");
		cityI18n3.setNameI18n("الاسم");
		cityI18n3.setGetAllTitleI18n("المدن");
		cityI18n3.setCreateTitleI18n("إنشاء مدينة جديدة");
		cityI18n3.setEditTitleI18n("تعديل المدينة");
		cityI18n3.setGetTitleI18n("المدينة");
		cityI18n3.setCreateTitleI18n("إنشاء مدينة جديدة");
		cityI18n3.setEditTitleI18n("تعديل المدينة");
		cityI18n3.setGetAllTitleI18n("المدن");
		cityI18nRepository.save(cityI18n3);

		cityI18n4.setLangI18n("FR");
		cityI18n4.setNameI18n("Nom");
		cityI18n4.setGetAllTitleI18n("Villes");
		cityI18n4.setCreateTitleI18n("Créer");
		cityI18n4.setEditTitleI18n("Modifier");
		cityI18n4.setGetTitleI18n("Ville");
		cityI18n4.setCreateTitleI18n("Créer");
		cityI18n4.setEditTitleI18n("Modifier");
		cityI18n4.setGetAllTitleI18n("Villes");
		cityI18nRepository.save(cityI18n4);

		cityI18n5.setLangI18n("ES");
		cityI18n5.setNameI18n("Nombre");
		cityI18n5.setGetAllTitleI18n("Ciudades");
		cityI18n5.setCreateTitleI18n("Crear");
		cityI18n5.setEditTitleI18n("Editar ciudad");
		cityI18n5.setGetTitleI18n("Ciudad");
		cityI18n5.setCreateTitleI18n("Crear");
		cityI18n5.setEditTitleI18n("Editar ciudad");
		cityI18n5.setGetAllTitleI18n("Ciudades");
		cityI18nRepository.save(cityI18n5);

	}

}
