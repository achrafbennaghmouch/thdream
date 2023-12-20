package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.GalleryI18nRepository;
import com.dev.delta.services.GalleryService;

@Service
public class GalleryDTO implements DTO {

	@Autowired
	GalleryService galleryService;

	@Autowired
	GalleryI18nRepository galleryI18nRepository;

	@Override
	public void populate() {

		gallery.setTitle("The Dream");
		gallery.setSubTitle("Unlock to enjoy the view of Martine");

		gallery2.setTitle("Life is Beautiful");
		gallery2.setSubTitle("Unlock to enjoy the view of Martine");

		gallery3.setTitle("The Dream");
		gallery3.setSubTitle("Unlock to enjoy the view of Martine");

		gallery4.setTitle("Life is Beautiful");
		gallery4.setSubTitle("Unlock to enjoy the view of Martine");

		galleryService.save(gallery);
		galleryService.save(gallery2);
		galleryService.save(gallery3);
		galleryService.save(gallery4);

		galleryI18n.setTitleI18n("Title");
		galleryI18n.setSubTitleI18n("SubTitle");
		galleryI18n.setGetTitleI18n("Gallery");
		galleryI18n.setCreateTitleI18n("Create");
		galleryI18n.setEditTitleI18n("Edit");
		galleryI18n.setGetAllTitleI18n("Galleries");
		galleryI18n.setLangI18n("EN");
		galleryI18nRepository.save(galleryI18n);

		galleryI18n2.setTitleI18n("Titel");
		galleryI18n2.setSubTitleI18n("Untertitel");
		galleryI18n2.setGetTitleI18n("Galerie");
		galleryI18n2.setCreateTitleI18n("Erstellen");
		galleryI18n2.setEditTitleI18n("Bearbeiten");
		galleryI18n2.setGetAllTitleI18n("Galerien");
		galleryI18n2.setLangI18n("DE");
		galleryI18nRepository.save(galleryI18n2);

		galleryI18n3.setTitleI18n("العنوان");
		galleryI18n3.setSubTitleI18n("الترجمة");
		galleryI18n3.setGetTitleI18n("المعرض");
		galleryI18n3.setCreateTitleI18n("إنشاء");
		galleryI18n3.setEditTitleI18n("تحرير");
		galleryI18n3.setGetAllTitleI18n("المعارض");
		galleryI18n3.setLangI18n("AR");
		galleryI18nRepository.save(galleryI18n3);

		galleryI18n4.setTitleI18n("Titre");
		galleryI18n4.setSubTitleI18n("Sous-titre");
		galleryI18n4.setGetTitleI18n("Galerie");
		galleryI18n4.setCreateTitleI18n("Créer");
		galleryI18n4.setEditTitleI18n("Modifier");
		galleryI18n4.setGetAllTitleI18n("Galeries");
		galleryI18n4.setLangI18n("FR");
		galleryI18nRepository.save(galleryI18n4);

		galleryI18n5.setTitleI18n("Título");
		galleryI18n5.setSubTitleI18n("Subtítulo");
		galleryI18n5.setGetTitleI18n("Galería");
		galleryI18n5.setCreateTitleI18n("Crear");
		galleryI18n5.setEditTitleI18n("Editar");
		galleryI18n5.setGetAllTitleI18n("Galerías");
		galleryI18n5.setLangI18n("ES");
		galleryI18nRepository.save(galleryI18n5);

	}

}
