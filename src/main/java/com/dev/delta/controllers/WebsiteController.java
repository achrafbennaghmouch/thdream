package com.dev.delta.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.LocaleResolver;

import com.dev.delta.entities.Blog;
import com.dev.delta.entities.BlogCategory;
import com.dev.delta.entities.Gallery;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.Message;
import com.dev.delta.entities.Notification;
import com.dev.delta.entities.Offer;
import com.dev.delta.entities.RoomType;
import com.dev.delta.i18n.repositories.WebsiteAboutI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteBlogI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteContactI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteHomeI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteRoomI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteSignInI18nRepository;
import com.dev.delta.repositories.CurrencyRepository;

import com.dev.delta.repositories.InformationRepository;

import com.dev.delta.repositories.MessageRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.repositories.OfferRepository;

import com.dev.delta.services.BlogCategoryService;
import com.dev.delta.services.BlogService;
import com.dev.delta.services.CheckInService;
import com.dev.delta.services.CityService;
import com.dev.delta.services.CountryService;
import com.dev.delta.services.CustomerService;
import com.dev.delta.services.EmployeeService;
import com.dev.delta.services.GalleryService;
import com.dev.delta.services.GuestTypeService;
import com.dev.delta.services.OfferService;
import com.dev.delta.services.RoomService;
import com.dev.delta.services.RoomTypeService;
import com.dev.delta.services.SubscriberService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class WebsiteController {

	@Autowired
	InformationRepository informationService;

	@Autowired
	private CheckInService checkInService;

	@Autowired
	private CityService cityService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private GuestTypeService guestTypeService;

	@Autowired
	private RoomTypeService roomTypeService;

	@Autowired
	private BlogService blogService;

	@Autowired
	private BlogCategoryService blogCategoryService;

	@Autowired
	private GalleryService galleryService;

	@Autowired
	OfferService offerService;

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	NotificationRepository notificationRepository;

	@Autowired
	RoomService roomService;

	@Autowired
	CustomerService customerService;


	@Autowired
	EmployeeService employeeService;



	@Autowired
	OfferRepository offerRepository;


	@Autowired
	SubscriberService subscriberService;

	@Autowired
	WebsiteMenuI18nRepository websiteMenuI18nRepository;

	@Autowired
	WebsiteContactI18nRepository websiteContactI18nRepository;

	@Autowired
	WebsiteFooterI18nRepository websiteFooterI18nRepository;

	@Autowired
	WebsiteSignInI18nRepository websiteSignInI18nRepository;

	@Autowired
	WebsiteAboutI18nRepository websiteAboutI18nRepository;

	@Autowired
	WebsiteBlogI18nRepository websiteBlogI18nRepository;

	@Autowired
	WebsiteRoomI18nRepository websiteRoomI18nRepository;

	@Autowired
	WebsiteHomeI18nRepository websiteHomeI18nRepository;


	@Autowired
	HttpServletRequest httpServletRequest;

	@Autowired
	HttpServletResponse httpServletResponse;

	@Autowired
	LocaleResolver localeResolver;

	@Autowired
	UIMenuHeaderUtil menuHeaderUtil;

	@Autowired
	CurrencyRepository currencyRepository;

	@GetMapping("/dashboard")
	public String homeAdmin(Model model) {
		List<Message> messages = messageRepository.findAll();
		List<Notification> notifications = notificationRepository.findAll();
		model.addAttribute("notifications", notifications);
		model.addAttribute("messages", messages);

		Long id = 1L;
		InformationHotel hotel = informationService.getById(id);
		int messageNb = (int) messageRepository.count();
		int notificationNb = (int) notificationRepository.count();
		int roomNB = (int) roomService.getCount();
		int checkInNB = (int) checkInService.getCount();

		int employeeNB = (int) employeeService.getCount();


		int offerNB = (int) offerRepository.count();

		int customerNB = (int) customerService.getCount();
		int blogNB = blogService.getCount();
		int subscriberNB = (int) subscriberService.getCount();

		model.addAttribute("roomNB", Integer.toString(roomNB));
		model.addAttribute("checkinNB", Integer.toString(checkInNB));

		model.addAttribute("employeeNB", Integer.toString(employeeNB));


		model.addAttribute("offerNB", Integer.toString(offerNB));

		model.addAttribute("customerNB", Integer.toString(customerNB));
		model.addAttribute("blogNB", Integer.toString(blogNB));
		model.addAttribute("subscriberNB", Integer.toString(subscriberNB));

		model.addAttribute("messageNB", Integer.toString(messageNb));
		model.addAttribute("notificationNB", Integer.toString(notificationNb));


		model.addAttribute("hotel", hotel);
		menuHeaderUtil.getMenuHeader(model);

		return "home/index";
	}

	@GetMapping("/")
	public String home(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		String lang = informationHotel.getLang();
		List<Offer> offers = offerService.getOffers();
		model.addAttribute("offers", offers);
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("cities", cityService.getCitys());
		model.addAttribute("countries", countryService.getCountrys());
		model.addAttribute("guestTypes", guestTypeService.getGuestTypes());
		model.addAttribute("roomTypes", roomTypeService.getRoomTypes());
		model.addAttribute("image", "1");
		List<Gallery> galleries = galleryService.getGalleries();
		model.addAttribute("galleries", galleries);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		model.addAttribute("home", websiteHomeI18nRepository.findByLang(lang));
		return "website/index";
	}

	@GetMapping("/about")
	public String about(Model model) {
		Long id = 1L;

		InformationHotel informationHotel = informationService.findById(id).get();
		String lang = informationHotel.getLang();
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("about", websiteAboutI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "website/about";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		String lang = informationHotel.getLang();
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("contact", websiteContactI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "website/contact";
	}

	@GetMapping("/room")
	public String room(Model model) {
		List<RoomType> roomtypes = roomTypeService.getRoomTypes();
		model.addAttribute("items", roomtypes);
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		String lang = informationHotel.getLang();
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("room", websiteRoomI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		model.addAttribute("hotel", informationHotel);
		model.addAttribute("currency", currencyRepository.findById(1L).get());

		return "website/room";
	}

	@GetMapping("/blog")
	public String blog(Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		model.addAttribute("hotel", informationHotel);
		List<Blog> blogs = blogService.getBlogs();
		List<BlogCategory> blogCategories = blogCategoryService.getBlogCategories();
		String lang = informationHotel.getLang();
		model.addAttribute("items", blogs);
		model.addAttribute("categories", blogCategories);
		model.addAttribute("menu", websiteMenuI18nRepository.findByLang(lang));
		model.addAttribute("blog", websiteBlogI18nRepository.findByLang(lang));
		model.addAttribute("footer", websiteFooterI18nRepository.findByLang(lang));
		return "/website/blog";
	}

	@GetMapping("/changelang/{lang}")
	public String changelang(@PathVariable("lang") String lang, Model model) {
		Long id = 1L;
		InformationHotel informationHotel = informationService.findById(id).get();
		informationHotel.setLang(lang);

		informationService.save(informationHotel);

		/*
		 * informationHotel = informationService.findById(id).get(); String
		 * langg=informationHotel.getLang(); System.err.println(langg);
		 * SessionLocaleResolver slr = new SessionLocaleResolver();
		 * if(langg.equals("AR")) { Locale arabicLocale = new
		 * Locale.Builder().setLanguageTag("ar-SA-u-nu-arab").build();
		 * 
		 * // slr.setDefaultLocale(arabicLocale);
		 * localeResolver.setLocale(httpServletRequest, httpServletResponse, Locale.UK);
		 * }else { Locale en = new Locale.Builder().setLanguageTag("en-US").build();
		 * //slr.setDefaultLocale(Locale.ENGLISH);
		 * localeResolver.setLocale(httpServletRequest, httpServletResponse, en); }
		 */

		return "redirect:/";
	}

}
