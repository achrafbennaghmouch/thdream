package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.RoomTypeI18nRepository;
import com.dev.delta.repositories.RoomTypeRepository;

@Service
public class RoomTypeDTO implements DTO {

	@Autowired
	RoomTypeRepository roomTypeRepository;

	@Autowired
	RoomTypeI18nRepository roomTypeI18nRepository;

	@Override
	public void populate() {

		roomType1.setTitle("Suite	Active");
		roomType1.setAdultCapacity("4");
		roomType1.setAirConditioner("");
		roomType1.setBathTub("");
		roomType1.setCoffeeMaker("on");
		roomType1.setDoubleBed("on");
		roomType1.setFreeNewspaper("");
		roomType1.setKidsCapacity("3");
		roomType1.setShortCode("on");
		roomType1.setWifi("on");


		roomType2.setTitle("Deluxe Room");
		roomType2.setAdultCapacity("4");
		roomType2.setAirConditioner("");
		roomType2.setBathTub("");
		roomType2.setCoffeeMaker("on");
		roomType2.setDoubleBed("on");
		roomType2.setFreeNewspaper("");
		roomType2.setKidsCapacity("3");
		roomType2.setShortCode("on");
		roomType2.setWifi("on");


		roomType3.setTitle("Regular Room");

		roomType3.setTitle("Deluxe Room");
		roomType3.setAdultCapacity("4");
		roomType3.setAirConditioner("");
		roomType3.setBathTub("on");
		roomType3.setCoffeeMaker("on");
		roomType3.setDoubleBed("on");
		roomType3.setFreeNewspaper("on");
		roomType3.setKidsCapacity("3");
		roomType3.setShortCode("on");
		roomType3.setWifi("on");


		roomType1.setBasePrice("199.0");
		roomType2.setBasePrice("399.0");
		roomType3.setBasePrice("299.0");
		roomTypeRepository.save(roomType1);
		roomTypeRepository.save(roomType2);
		roomTypeRepository.save(roomType3);

		roomTypeI18n.setBasePriceI18n("Base Pice");
		roomTypeI18n.setTitleI18n("Room Type");
		roomTypeI18n.setGetTitleI18n("Room Types");
		roomTypeI18n.setCreateTitleI18n("Create");
		roomTypeI18n.setEditTitleI18n("Edit");
		roomTypeI18n.setGetAllTitleI18n("Room Types");
		roomTypeI18n.setLangI18n("EN");
		roomTypeI18n.setAdultCapacityI18n("Adult Capacity");
		roomTypeI18n.setAirConditionerI18n("Air conditioner");
		roomTypeI18n.setAmenityI18n("Amenity");
		roomTypeI18n.setBathTubI18n("Bathtub");
		roomTypeI18n.setCoffeeMakerI18n("Cofee Maker");
		roomTypeI18n.setDoubleBedI18n("Double Bed");
		roomTypeI18n.setFreeNewspaperI18n("Free News Paper");
		roomTypeI18n.setKidsCapacityI18n("Kids Capacity");
		roomTypeI18n.setMiniFridgeI18n("Mini Fridge");
		roomTypeI18n.setShortCodeI18n("ShortCode");
		roomTypeI18n.setWifiI18n("Wifi");
		roomTypeI18n.setStatusI18n("Status");
		roomTypeI18nRepository.save(roomTypeI18n);

		roomTypeI18n2.setBasePriceI18n("Grundpreis");
		roomTypeI18n2.setTitleI18n("Zimmertyp");
		roomTypeI18n2.setGetTitleI18n("Zimmertype");
		roomTypeI18n2.setCreateTitleI18n("Erstellen");
		roomTypeI18n2.setEditTitleI18n("Bearbeiten");
		roomTypeI18n2.setGetAllTitleI18n("Zimmertypen");
		roomTypeI18n2.setLangI18n("DE");
		roomTypeI18n2.setAdultCapacityI18n("Erwachsene Kapazität");
		roomTypeI18n2.setAirConditionerI18n("Klimaanlage");
		roomTypeI18n2.setAmenityI18n("Ausstattung");
		roomTypeI18n2.setBathTubI18n("Badewanne");
		roomTypeI18n2.setCoffeeMakerI18n("Kaffeemaschine");
		roomTypeI18n2.setDoubleBedI18n("Doppelbett");
		roomTypeI18n2.setFreeNewspaperI18n("Kostenlose Zeitung");
		roomTypeI18n2.setKidsCapacityI18n("Kinderkapazität");
		roomTypeI18n2.setMiniFridgeI18n("Minikühlschrank");
		roomTypeI18n2.setShortCodeI18n("Kurzcode");
		roomTypeI18n2.setWifiI18n("Wifi");
		roomTypeI18n2.setStatusI18n("Status");
		roomTypeI18nRepository.save(roomTypeI18n2);

		roomTypeI18n3.setBasePriceI18n("Precio base");
		roomTypeI18n3.setTitleI18n("Tipo de habitación");
		roomTypeI18n3.setGetTitleI18n("Tipos de habitaciones");
		roomTypeI18n3.setCreateTitleI18n("Crear");
		roomTypeI18n3.setEditTitleI18n("Editar");
		roomTypeI18n3.setGetAllTitleI18n("Tipos de habitaciones");
		roomTypeI18n3.setLangI18n("ES");
		roomTypeI18n3.setAdultCapacityI18n("Capacidad para adultos");
		roomTypeI18n3.setAirConditionerI18n("Aire acondicionado");
		roomTypeI18n3.setAmenityI18n("Servicios");
		roomTypeI18n3.setBathTubI18n("Bañera");
		roomTypeI18n3.setCoffeeMakerI18n("Cafetera");
		roomTypeI18n3.setDoubleBedI18n("Cama doble");
		roomTypeI18n3.setFreeNewspaperI18n("Documento de noticias gratuito");
		roomTypeI18n3.setKidsCapacityI18n("Capacidad de niños");
		roomTypeI18n3.setMiniFridgeI18n("Mini nevera");
		roomTypeI18n3.setShortCodeI18n("Código corto");
		roomTypeI18n3.setWifiI18n("Wifi");
		roomTypeI18n3.setStatusI18n("Estado");
		roomTypeI18nRepository.save(roomTypeI18n3);

		roomTypeI18n4.setBasePriceI18n("Pièce de base");
		roomTypeI18n4.setTitleI18n("Type de pièce");
		roomTypeI18n4.setGetTitleI18n("Types de pièces");
		roomTypeI18n4.setCreateTitleI18n("Créer");
		roomTypeI18n4.setEditTitleI18n("Modifier");
		roomTypeI18n4.setGetAllTitleI18n("Types de pièces");
		roomTypeI18n4.setLangI18n("FR");
		roomTypeI18n4.setAdultCapacityI18n("Capacité adulte");
		roomTypeI18n4.setAirConditionerI18n("Climatiseur");
		roomTypeI18n4.setAmenityI18n("Amenity");
		roomTypeI18n4.setBathTubI18n("Baignoire");
		roomTypeI18n4.setCoffeeMakerI18n("Machine à café");
		roomTypeI18n4.setDoubleBedI18n("Lit double");
		roomTypeI18n4.setFreeNewspaperI18n("Papier d'actualités gratuit");
		roomTypeI18n4.setKidsCapacityI18n("Capacité des enfants");
		roomTypeI18n4.setMiniFridgeI18n("Mini réfrigérateur");
		roomTypeI18n4.setShortCodeI18n("ShortCode");
		roomTypeI18n4.setWifiI18n("Wifi");
		roomTypeI18n4.setStatusI18n("Statut");
		roomTypeI18nRepository.save(roomTypeI18n4);

		roomTypeI18n5.setBasePriceI18n("السعر الأساسي");
		roomTypeI18n5.setTitleI18n("نوع الغرفة");
		roomTypeI18n5.setGetTitleI18n("أنواع الغرف");
		roomTypeI18n5.setCreateTitleI18n("إنشاء");
		roomTypeI18n5.setEditTitleI18n("تحرير");
		roomTypeI18n5.setGetAllTitleI18n("أنواع الغرف");
		roomTypeI18n5.setLangI18n("AR");
		roomTypeI18n5.setAdultCapacityI18n("سعة البالغين");
		roomTypeI18n5.setAirConditionerI18n("مكيف الهواء");
		roomTypeI18n5.setAmenityI18n("الراحة");
		roomTypeI18n5.setBathTubI18n("حوض الاستحمام");
		roomTypeI18n5.setCoffeeMakerI18n("صانع القهوة");
		roomTypeI18n5.setDoubleBedI18n("سرير مزدوج");
		roomTypeI18n5.setFreeNewspaperI18n("جريدة أخبار مجانية");
		roomTypeI18n5.setKidsCapacityI18n("سعة الأطفال");
		roomTypeI18n5.setMiniFridgeI18n("ثلاجة صغيرة");
		roomTypeI18n5.setShortCodeI18n("الرمز المختصر");
		roomTypeI18n5.setWifiI18n("Wifi");
		roomTypeI18n5.setStatusI18n("الحالة");
		roomTypeI18nRepository.save(roomTypeI18n5);

	}

}
