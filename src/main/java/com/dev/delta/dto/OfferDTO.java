package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.OfferI18nRepository;
import com.dev.delta.services.OfferService;

@Service
public class OfferDTO implements DTO {

	@Autowired
	OfferService offerService;

	@Autowired
	OfferI18nRepository offerI18nRepository;

	@Override
	public void populate() {
		offer.setDescription("Comes with pool");
		offer.setImage("/photos/offer/1.png");
		offer.setName("offer 1");
		offer.setTitle("Suite magnifique");

		offer2.setDescription("une piscine extérieure, un parking privé, un jardin et une terrasse.");
		offer2.setImage("/photos/offer/2.png");
		offer2.setName("offer 2");
		offer2.setTitle("Elysian Retreat");

		offer3.setDescription("Luxaries condition\r\n" + "3 Adults & 2 Children size\r\n" + "Sea view side");
		offer3.setImage("/photos/offer/3.png");
		offer3.setName("offer 3");
		offer3.setTitle("Up to 35% savings on Club\r\n" + "rooms and Suites");
		offerService.save(offer);
		offerService.save(offer2);
		offerService.save(offer3);

		offerI18n2.setDescriptionI18n("Beschreibung");
		offerI18n2.setImageI18n("Bild");
		offerI18n2.setNameI18n("Name");
		offerI18n2.setTitleI18n("Titel");
		offerI18n2.setGetTitleI18n("Angebot");
		offerI18n2.setCreateTitleI18n("Erstellen");
		offerI18n2.setEditTitleI18n("Bearbeiten");
		offerI18n2.setGetAllTitleI18n("Angebote");
		offerI18n2.setLangI18n("DE");
		offerI18nRepository.save(offerI18n2);

		offerI18n3.setDescriptionI18n("Descripción");
		offerI18n3.setImageI18n("Imagen");
		offerI18n3.setNameI18n("Nombre");
		offerI18n3.setTitleI18n("Título");
		offerI18n3.setGetTitleI18n("Oferta");
		offerI18n3.setCreateTitleI18n("Crear");
		offerI18n3.setEditTitleI18n("Editar");
		offerI18n3.setGetAllTitleI18n("Ofertas");
		offerI18n3.setLangI18n("ES");
		offerI18nRepository.save(offerI18n3);

		offerI18n4.setDescriptionI18n("Description");
		offerI18n4.setImageI18n("Image");
		offerI18n4.setNameI18n("Nom");
		offerI18n4.setTitleI18n("Titre");
		offerI18n4.setGetTitleI18n("Offres");
		offerI18n4.setCreateTitleI18n("Créer");
		offerI18n4.setEditTitleI18n("Modifier");
		offerI18n4.setGetAllTitleI18n("Offres");
		offerI18n4.setLangI18n("FR");
		offerI18nRepository.save(offerI18n4);

		offerI18n5.setDescriptionI18n("الوصف");
		offerI18n5.setImageI18n("صورة");
		offerI18n5.setNameI18n("الاسم");
		offerI18n5.setTitleI18n("العنوان");
		offerI18n5.setGetTitleI18n("عرض");
		offerI18n5.setCreateTitleI18n("إنشاء");
		offerI18n5.setEditTitleI18n("تحرير");
		offerI18n5.setGetAllTitleI18n("العروض");
		offerI18n5.setLangI18n("AR");
		offerI18nRepository.save(offerI18n5);

	}

}
