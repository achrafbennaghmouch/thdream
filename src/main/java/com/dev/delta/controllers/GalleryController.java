package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.entities.Gallery;
import com.dev.delta.i18n.entities.GalleryI18n;
import com.dev.delta.i18n.repositories.GalleryI18nRepository;
import com.dev.delta.services.GalleryService;
import com.dev.delta.services.InformationService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class GalleryController {

	@Autowired
	GalleryService galleryService;
	@Autowired
	InformationService informationService;
	@Autowired
	GalleryI18nRepository galleryI18nRepository;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/galleries")
	public String getGallery(Model model) {
		List<Gallery> galleries = galleryService.getGalleries();

		model.addAttribute("items", galleries);
		String lang = informationService.getSeletedLang();
		GalleryI18n galleryI18n = galleryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", galleryI18n);
		menuHeaderUtil.getMenuHeader(model);

		return "gallery/galleries";
	}

	@GetMapping("/add-gallery")
	public String addGallery(Model model) {
		String lang = informationService.getSeletedLang();
		GalleryI18n galleryI18n = galleryI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", galleryI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "gallery/add";
	}

	@PostMapping("/addgallery")
	public String addFood(Gallery gallery) {
		galleryService.save(gallery);
		return "redirect:/galleries";
	}

	@GetMapping("/deletegallery/{id}")
	@Transactional
	public String deleteGallery(@PathVariable("id") Long id) {
		galleryService.delete(id);
		return "redirect:/galleries";
	}
}
