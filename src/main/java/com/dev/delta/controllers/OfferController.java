package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.Offer;
import com.dev.delta.i18n.entities.OfferI18n;
import com.dev.delta.i18n.repositories.OfferI18nRepository;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.OfferService;
import com.dev.delta.util.FileUploadUtil;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class OfferController {

	@Autowired
	private OfferService offerService;
	@Autowired
	InformationService informationService;
	@Autowired
	OfferI18nRepository offerI18nRepository;
	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@GetMapping("/offersadmin")
	public String getOffersAdmin(Model model) {
		List<Offer> offers = offerService.getOffers();
		model.addAttribute("items", offers);
		String lang = informationService.getSeletedLang();
		OfferI18n offerI18n = offerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", offerI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "offer/offers";
	}

	@GetMapping("/add-offer")
	public String getaddOffer(Model model) {
		String lang = informationService.getSeletedLang();
		OfferI18n offerI18n = offerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", offerI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "offer/add";
	}

	@PostMapping("/addoffer")
	public RedirectView saveOffer(Offer offer, @RequestParam("images") MultipartFile multipartFile)
			throws IOException, ParseException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		offer.setImage(fileName);
		offerService.save(offer);
		// String uploadDir = "src/main/resources/static/photos/" + savedBlog.getId();
		String uploadDir = "src/main/resources/static/photos/offer";
		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return new RedirectView("/offersadmin", true);
	}

	@RequestMapping("/offer/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Offer offer = offerService.findById(id);
		model.addAttribute("item", offer);
		String lang = informationService.getSeletedLang();
		OfferI18n offerI18n = offerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", offerI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "offer/view";
	}

	@RequestMapping("/editoffer/{id}")
	public String findOfferById(@PathVariable("id") Long id, Model model) {
		Offer offer = offerService.findById(id);
		model.addAttribute("item", offer);
		String lang = informationService.getSeletedLang();
		OfferI18n offerI18n = offerI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", offerI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "offer/edit";
	}

	@PostMapping("/updateoffer/{id}")
	public String updateOffer(@PathVariable("id") long id, @Validated Offer offer, BindingResult result, Model model) {

		offerService.save(offer);
		return "redirect:/offersadmin";
	}

	/**
	 * deleteAmenity
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteoffer/{id}")
	@Transactional
	public String deleteOffer(@PathVariable("id") Long id) {
		offerService.delete(id);
		return "redirect:/offersadmin";
	}

}
