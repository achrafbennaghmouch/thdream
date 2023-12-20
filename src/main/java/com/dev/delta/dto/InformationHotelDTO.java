package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.InformationHotelRepository;
import com.dev.delta.i18n.repositories.InformationI18nRepository;
import com.dev.delta.repositories.InformationRepository;

@Service
public class InformationHotelDTO implements DTO {

	@Autowired
	InformationRepository informationService;

	@Autowired
	InformationHotelRepository informationHotelRepository;

	@Autowired
	InformationI18nRepository informationI18nRepository;

	@Override
	public void populate() {
		informationHotel.setAdress("\r\n" + "Maarif rue 132 quartier  20440 Casablanca, Maroc");
		informationHotel.setDescription(
				" Notre site est conçu pour vous offrir un aperçu complet de notre établissement, de ses installations, et des services de qualité que nous proposons. ");
		informationHotel.setEmail("thedream@gmail.com");
		informationHotel.setName("The Dream");
		informationHotel.setTelephone("+212 687 327 3242");
		informationHotel.setFacebook("https://www.facebook.com");
		informationHotel.setTwitter("https://www.twitter.com");
		informationHotel.setInstagram("https://www.instagram.com");
		informationHotel.setLang("EN");
		informationHotel.setLangbackoffice("EN");
		informationService.save(informationHotel);

		informationHotelI18n.setAdressI18n("Address");
		informationHotelI18n.setDescriptionI18n("Description");
		informationHotelI18n.setEmailI18n("Email");
		informationHotelI18n.setNameI18n("Name");
		informationHotelI18n.setTelephoneI18n("Phone");
		informationHotelI18n.setFacebookI18n("Facebook");
		informationHotelI18n.setTwitterI18n("Twitter");
		informationHotelI18n.setInstagramI18n("Instagram");
		informationHotelI18n.setLangI18n("EN");
		informationHotelI18n.setLangbackoficeI18n("Admin language");
		informationHotelI18n.setLang("Client language");
		informationHotelI18n.setGetAllTitleI18n("Hotel Informations");
		informationHotelI18n.setCreateTitleI18n("Create ");
		informationHotelI18n.setEditTitleI18n("Edit");
		informationHotelI18n.setGetTitleI18n("Hotel Informations");
		informationI18nRepository.save(informationHotelI18n);

		informationHotelI18n2.setAdressI18n("Anschrift");
		informationHotelI18n2.setDescriptionI18n("Beschreibung");
		informationHotelI18n2.setEmailI18n("Email");
		informationHotelI18n2.setNameI18n("Name");
		informationHotelI18n2.setTelephoneI18n("Handy");
		informationHotelI18n2.setFacebookI18n("Facebook");
		informationHotelI18n2.setTwitterI18n("Twitter");
		informationHotelI18n2.setInstagramI18n("Instagram");
		informationHotelI18n2.setLangI18n("DE");
		informationHotelI18n2.setLangbackoficeI18n("Administratorsprache");
		informationHotelI18n2.setLang("Benutzersprache");
		informationHotelI18n2.setGetAllTitleI18n("Informations");
		informationHotelI18n2.setCreateTitleI18n("Erstellen");
		informationHotelI18n2.setEditTitleI18n("Bearbeiten");
		informationHotelI18n2.setGetTitleI18n("Information");
		informationI18nRepository.save(informationHotelI18n2);

		informationHotelI18n3.setAdressI18n("العنوان");
		informationHotelI18n3.setDescriptionI18n("الوصف");
		informationHotelI18n3.setEmailI18n("البريد الإلكتروني");
		informationHotelI18n3.setNameI18n("الاسم");
		informationHotelI18n3.setTelephoneI18n("الهاتف");
		informationHotelI18n3.setFacebookI18n("Facebook");
		informationHotelI18n3.setTwitterI18n("Twitter");
		informationHotelI18n3.setInstagramI18n("Instagram");
		informationHotelI18n3.setLangI18n("AR");
		informationHotelI18n3.setLangbackoficeI18n("لغة الادارة");
		informationHotelI18n3.setLang("لغة المستخدم");
		informationHotelI18n3.setGetAllTitleI18n("معلومات الفندق");
		informationHotelI18n3.setCreateTitleI18n("إنشاء");
		informationHotelI18n3.setEditTitleI18n("تحرير");
		informationHotelI18n3.setGetTitleI18n("معلومات الفندق");
		informationI18nRepository.save(informationHotelI18n3);

		informationHotelI18n4.setAdressI18n("Adresse");
		informationHotelI18n4.setDescriptionI18n("Description");
		informationHotelI18n4.setEmailI18n("Email");
		informationHotelI18n4.setNameI18n("Nom");
		informationHotelI18n4.setTelephoneI18n("Téléphone");
		informationHotelI18n4.setFacebookI18n("Facebook");
		informationHotelI18n4.setTwitterI18n("Twitter");
		informationHotelI18n4.setInstagramI18n("Instagram");
		informationHotelI18n4.setLangI18n("FR");
		informationHotelI18n4.setLangbackoficeI18n("Langue admin");
		informationHotelI18n4.setLang("Langue utilisateur");
		informationHotelI18n4.setGetAllTitleI18n("Hotel Informations");
		informationHotelI18n4.setCreateTitleI18n("Créer ");
		informationHotelI18n4.setEditTitleI18n("Modifier");
		informationHotelI18n4.setGetTitleI18n("Hotel Informations");
		informationI18nRepository.save(informationHotelI18n4);

		informationHotelI18n5.setAdressI18n("Dirección");
		informationHotelI18n5.setDescriptionI18n("Descripción");
		informationHotelI18n5.setEmailI18n("Correo electrónico");
		informationHotelI18n5.setNameI18n("Nombre");
		informationHotelI18n5.setTelephoneI18n("Teléfono");
		informationHotelI18n5.setFacebookI18n("Facebook");
		informationHotelI18n5.setTwitterI18n("Twitter");
		informationHotelI18n5.setInstagramI18n("Instagram");
		informationHotelI18n5.setLangI18n("ES");
		informationHotelI18n5.setLangbackoficeI18n("idioma de administrador");
		informationHotelI18n5.setLang("Idioma del usuario");
		informationHotelI18n5.setGetAllTitleI18n("Información del hotel");
		informationHotelI18n5.setCreateTitleI18n("Crear");
		informationHotelI18n5.setEditTitleI18n("Editar ");
		informationHotelI18n5.setGetTitleI18n("Información del hotel");
		informationI18nRepository.save(informationHotelI18n5);

	}

}
