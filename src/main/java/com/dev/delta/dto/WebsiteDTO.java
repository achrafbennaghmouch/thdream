package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.WebsiteAboutI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteBlogI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteBookingRoomI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteContactI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteHomeI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteRoomI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteSignInI18nRepository;

@Service
public class WebsiteDTO implements DTO {

	@Autowired
	WebsiteMenuI18nRepository websiteMenuI18nRepository;

	@Autowired
	WebsiteFooterI18nRepository websiteFooterI18nRepository;

	@Autowired
	WebsiteContactI18nRepository websiteContactI18nRepository;

	@Autowired
	WebsiteHomeI18nRepository websiteHomeI18nRepository;

	@Autowired
	WebsiteSignInI18nRepository websiteSignInI18nRepository;

	@Autowired
	WebsiteAboutI18nRepository websiteAboutI18nRepository;

	@Autowired
	WebsiteRoomI18nRepository websiteRoomI18nRepository;

	@Autowired
	WebsiteBlogI18nRepository websiteBlogI18nRepository;

	@Autowired
	WebsiteBookingRoomI18nRepository websiteBookingRoomI18nRepository;

	@Override
	public void populate() {

		insertMenu();
		insertHomePage();
		insertAboutPage();
		insertBlogPage();
		insertContactPage();
		insertFooterPage();
		insertRoomPage();
		insertSignInPage();
		insertBookingRoomPage();

	}

	private void insertBookingRoomPage() {

		websitebookingRoomI18n.setBookI18n("book");
		websitebookingRoomI18n.setBookingI18n("Booking");
		websitebookingRoomI18n.setBookTitleI18n("Booking Room");
		websitebookingRoomI18n.setChoosepaymentI18n("Choose payment method");
		websitebookingRoomI18n.setConfirmBookingI18n("Confirm booking");
		websitebookingRoomI18n.setDetailsI18n("Details");
		websitebookingRoomI18n.setPaymentI18n("Payment");
		websitebookingRoomI18n.setPaynowI18n("Pay NOW");
		websitebookingRoomI18n.setPrintI18n("Print");
		websitebookingRoomI18n.setSaveI18n("Save");
		websitebookingRoomI18n.setSummaryI18n("Summary");
		websitebookingRoomI18n.setLangI18n("EN");
		websitebookingRoomI18n.setContactdetailsI18n("Contact Details");
		websitebookingRoomI18n.setBookingdetailsI18n("Booking Details");
		websitebookingRoomI18n.setInvoiceI18n("Sale Invoice");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n);

		websitebookingRoomI18n3.setBookI18n("libro");
		websitebookingRoomI18n3.setBookingI18n("Reserva");
		websitebookingRoomI18n3.setBookTitleI18n("Sala de reservas");
		websitebookingRoomI18n3.setChoosepaymentI18n("Elegir método de pago");
		websitebookingRoomI18n3.setConfirmBookingI18n("Confirmar reserva");
		websitebookingRoomI18n3.setDetailsI18n("Detalles");
		websitebookingRoomI18n3.setPaymentI18n("Pago");
		websitebookingRoomI18n3.setPaynowI18n("Pagar AHORA");
		websitebookingRoomI18n3.setPrintI18n("Imprimir");
		websitebookingRoomI18n3.setSaveI18n("Guardar");
		websitebookingRoomI18n3.setSummaryI18n("Resumen");
		websitebookingRoomI18n3.setLangI18n("ES");
		websitebookingRoomI18n3.setContactdetailsI18n("Detalles de contacto");
		websitebookingRoomI18n3.setBookingdetailsI18n("Detalles de la reserva");
		websitebookingRoomI18n3.setInvoiceI18n("Factura de venta");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n3);

		websitebookingRoomI18n2.setBookI18n("حجز");
		websitebookingRoomI18n2.setBookingI18n("حجز");
		websitebookingRoomI18n2.setBookTitleI18n("غرفة الحجز");
		websitebookingRoomI18n2.setChoosepaymentI18n("اختر وسيلة الدفع");
		websitebookingRoomI18n2.setConfirmBookingI18n("تأكيد الحجز");
		websitebookingRoomI18n2.setDetailsI18n("تفاصيل");
		websitebookingRoomI18n2.setPaymentI18n("دفع");
		websitebookingRoomI18n2.setPaynowI18n("ادفع الآن");
		websitebookingRoomI18n2.setPrintI18n("طباعة");
		websitebookingRoomI18n2.setSaveI18n("حفظ");
		websitebookingRoomI18n2.setSummaryI18n("ملخص");
		websitebookingRoomI18n2.setContactdetailsI18n("بيانات المتصل");
		websitebookingRoomI18n2.setBookingdetailsI18n("تفاصيل الحجز");
		websitebookingRoomI18n2.setInvoiceI18n("فاتورة");
		websitebookingRoomI18n2.setLangI18n("AR");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n2);

		websitebookingRoomI18n4.setBookI18n("livre");
		websitebookingRoomI18n4.setBookingI18n("Réservation");
		websitebookingRoomI18n4.setBookTitleI18n("Salle de réservation");
		websitebookingRoomI18n4.setChoosepaymentI18n("Choisir le mode de paiement");
		websitebookingRoomI18n4.setConfirmBookingI18n("Confirmer la réservation");
		websitebookingRoomI18n4.setDetailsI18n("Détails");
		websitebookingRoomI18n4.setPaymentI18n("Paiement");
		websitebookingRoomI18n4.setPaynowI18n("Payer MAINTENANT");
		websitebookingRoomI18n4.setPrintI18n("Imprimer");
		websitebookingRoomI18n4.setSaveI18n("Enregistrer");
		websitebookingRoomI18n4.setSummaryI18n("Résumé");
		websitebookingRoomI18n4.setLangI18n("FR");
		websitebookingRoomI18n4.setContactdetailsI18n("Coordonnées");
		websitebookingRoomI18n4.setBookingdetailsI18n("Détails de la réservation");
		websitebookingRoomI18n4.setInvoiceI18n("Facture de vente");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n4);

		websitebookingRoomI18n5.setBookI18n("Buch");
		websitebookingRoomI18n5.setBookingI18n("Buchung");
		websitebookingRoomI18n5.setBookTitleI18n("Buchungsraum");
		websitebookingRoomI18n5.setChoosepaymentI18n("Zahlungsmethode wählen");
		websitebookingRoomI18n5.setConfirmBookingI18n("Buchung bestätigen");
		websitebookingRoomI18n5.setDetailsI18n("Details");
		websitebookingRoomI18n5.setPaymentI18n("Zahlung");
		websitebookingRoomI18n5.setPaynowI18n("Jetzt bezahlen");
		websitebookingRoomI18n5.setPrintI18n("Drucken");
		websitebookingRoomI18n5.setSaveI18n("Speichern");
		websitebookingRoomI18n5.setSummaryI18n("Zusammenfassung");
		websitebookingRoomI18n5.setLangI18n("DE");
		websitebookingRoomI18n5.setContactdetailsI18n("Kontaktdetails");
		websitebookingRoomI18n5.setBookingdetailsI18n("Buchungsdetails");
		websitebookingRoomI18n5.setInvoiceI18n("Verkaufsrechnung");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n5);

	}

	private void insertSignInPage() {
		websiteSignInI18n.setAdminI18n("Username");
		websiteSignInI18n.setLoginI18n("Sign In ");
		websiteSignInI18n.setPageTitleI18n("Sign In");
		websiteSignInI18n.setPasswordI18n("Password");
		websiteSignInI18n.setWebsiteI18n("Website");
		websiteSignInI18n.setLang("EN");

		websiteSignInI18n3.setAdminI18n("Nombre de usuario");
		websiteSignInI18n3.setLoginI18n("Iniciar sesión");
		websiteSignInI18n3.setPageTitleI18n("Iniciar sesión");
		websiteSignInI18n3.setPasswordI18n("Contraseña");
		websiteSignInI18n3.setWebsiteI18n("Sitio web");
		websiteSignInI18n3.setLang("ES");

		websiteSignInI18n4.setAdminI18n("Nom d'utilisateur");
		websiteSignInI18n4.setLoginI18n("Connexion ");
		websiteSignInI18n4.setPageTitleI18n("Connexion");
		websiteSignInI18n4.setPasswordI18n("Mot de passe");
		websiteSignInI18n4.setWebsiteI18n("Site Web");
		websiteSignInI18n4.setLang("FR");

		websiteSignInI18n5.setAdminI18n("Benutzername");
		websiteSignInI18n5.setLoginI18n("Anmelden");
		websiteSignInI18n5.setPageTitleI18n("Anmelden");
		websiteSignInI18n5.setPasswordI18n("Passwort");
		websiteSignInI18n5.setWebsiteI18n("Website");
		websiteSignInI18n5.setLang("DE");

		websiteSignInI18n2.setAdminI18n("اسم المستخدم");
		websiteSignInI18n2.setLoginI18n("تسجيل الدخول");
		websiteSignInI18n2.setPageTitleI18n("تسجيل الدخول");
		websiteSignInI18n2.setPasswordI18n("كلمه السر");
		websiteSignInI18n2.setWebsiteI18n("موقع ويب");
		websiteSignInI18n2.setLang("AR");

		websiteSignInI18nRepository.save(websiteSignInI18n);
		websiteSignInI18nRepository.save(websiteSignInI18n2);
		websiteSignInI18nRepository.save(websiteSignInI18n3);
		websiteSignInI18nRepository.save(websiteSignInI18n4);
		websiteSignInI18nRepository.save(websiteSignInI18n5);

	}

	private void insertRoomPage() {
		websiteRoomI18n.setPageTitleI18n("Rooms");
		websiteRoomI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteRoomI18n.setRoomSubTitleI18n("Choose a Better Room");
		websiteRoomI18n.setRoomTitleI18n("Featured Rooms");
		websiteRoomI18n.setLang("EN");

		websiteRoomI18n4.setPageTitleI18n("Räume");
		websiteRoomI18n4.setReservationSectionI18n("Für Reservierung oder Abfrage?");
		websiteRoomI18n4.setRoomSubTitleI18n("Wählen Sie ein besseres Zimmer");
		websiteRoomI18n4.setRoomTitleI18n("Empfohlene Räume");
		websiteRoomI18n4.setLang("DE");

		websiteRoomI18n3.setPageTitleI18n("Chambres");
		websiteRoomI18n3.setReservationSectionI18n("Pour réservation 0r requête ?");
		websiteRoomI18n3.setRoomSubTitleI18n("Choisissez une meilleure chambre");
		websiteRoomI18n3.setRoomTitleI18n("Chambres en vedette");
		websiteRoomI18n3.setLang("FR");

		websiteRoomI18n5.setPageTitleI18n("Habitaciones");
		websiteRoomI18n5.setReservationSectionI18n("¿Para reserva o consulta?");
		websiteRoomI18n5.setRoomSubTitleI18n("Elija una habitación mejor");
		websiteRoomI18n5.setRoomTitleI18n("Habitaciones destacadas");
		websiteRoomI18n5.setLang("ES");

		websiteRoomI18n2.setPageTitleI18n("غرف");
		websiteRoomI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteRoomI18n2.setRoomSubTitleI18n("اختر غرفة أفضل");
		websiteRoomI18n2.setRoomTitleI18n("غرف مميزة");
		websiteRoomI18n2.setLang("AR");

		websiteRoomI18nRepository.save(websiteRoomI18n);
		websiteRoomI18nRepository.save(websiteRoomI18n2);
		websiteRoomI18nRepository.save(websiteRoomI18n3);
		websiteRoomI18nRepository.save(websiteRoomI18n4);
		websiteRoomI18nRepository.save(websiteRoomI18n5);

	}

	private void insertFooterPage() {
		websiteFooterI18n.setAddressTitleI18n("Address");
		websiteFooterI18n.setNavigationTitleI18n("Navigation");
		websiteFooterI18n.setNewsletterSubTitleI18n("Subscribe newsletter to get updates");
		websiteFooterI18n.setNewsletterTitleI18n("Newsletter");
		websiteFooterI18n.setReservationTitleI18n("Revervation");
		websiteFooterI18n.setSignUpButton("Sign Up");
		websiteFooterI18n.setEmail("Email");
		websiteFooterI18n.setLang("EN");

		websiteFooterI18n3.setAddressTitleI18n("Adresse");
		websiteFooterI18n3.setNavigationTitleI18n("Navigation");
		websiteFooterI18n3.setNewsletterSubTitleI18n("Newsletter abonnieren, um Updates zu erhalten");
		websiteFooterI18n3.setNewsletterTitleI18n("Newsletter");
		websiteFooterI18n3.setReservationTitleI18n("Revervation");
		websiteFooterI18n3.setSignUpButton("Anmelden");
		websiteFooterI18n3.setEmail("E-Mail");
		websiteFooterI18n3.setLang("DE");

		websiteFooterI18n4.setAddressTitleI18n("Adresse");
		websiteFooterI18n4.setNavigationTitleI18n("Navigation");
		websiteFooterI18n4.setNewsletterSubTitleI18n("Abonnez-vous à la newsletter pour recevoir les mises à jour");
		websiteFooterI18n4.setNewsletterTitleI18n("Newsletter");
		websiteFooterI18n4.setReservationTitleI18n("Revervation");
		websiteFooterI18n4.setSignUpButton("Inscrivez-vous");
		websiteFooterI18n4.setEmail("Email");
		websiteFooterI18n4.setLang("FR");

		websiteFooterI18n2.setAddressTitleI18n("عنوان");
		websiteFooterI18n2.setNavigationTitleI18n("التنقل");
		websiteFooterI18n2.setNewsletterSubTitleI18n("اشترك في النشرة الإخبارية للحصول على التحديثات");
		websiteFooterI18n2.setNewsletterTitleI18n("النشرة");
		websiteFooterI18n2.setReservationTitleI18n("حجز");
		websiteFooterI18n2.setSignUpButton("اشتراك");
		websiteFooterI18n2.setEmail("بريد الالكتروني");
		websiteFooterI18n2.setLang("AR");

		websiteFooterI18n5.setAddressTitleI18n("Dirección");
		websiteFooterI18n5.setNavigationTitleI18n("Navegación");
		websiteFooterI18n5.setNewsletterSubTitleI18n("Suscríbase al boletín para recibir actualizaciones");
		websiteFooterI18n5.setNewsletterTitleI18n("Boletín");
		websiteFooterI18n5.setReservationTitleI18n("Revervación");
		websiteFooterI18n5.setSignUpButton("Registrarse");
		websiteFooterI18n5.setEmail("Correo electrónico");
		websiteFooterI18n5.setLang("ES");

		websiteFooterI18nRepository.save(websiteFooterI18n);
		websiteFooterI18nRepository.save(websiteFooterI18n2);
		websiteFooterI18nRepository.save(websiteFooterI18n3);
		websiteFooterI18nRepository.save(websiteFooterI18n4);
		websiteFooterI18nRepository.save(websiteFooterI18n5);

	}

	private void insertContactPage() {
		websiteContactI18n.setEmailI18n("Email");
		websiteContactI18n.setEmailSubtitleI18n("Send us your query anytime");
		websiteContactI18n.setFormTitleI18n("Get in Touch");
		websiteContactI18n.setMessageI18n("Message");
		websiteContactI18n.setNameI18n("Name");
		websiteContactI18n.setPageTitleI18n("Get in Touch");
		websiteContactI18n.setPhoneSubtitleI18n("Mon to Fri 9am to 6pm");
		websiteContactI18n.setSendI18n("Send");
		websiteContactI18n.setSubjectI18n("Subject");
		websiteContactI18n.setLang("EN");

		websiteContactI18n2.setEmailI18n("بريد الالكتروني");
		websiteContactI18n2.setEmailSubtitleI18n("أرسل لنا استفسارك في أي وقت");
		websiteContactI18n2.setFormTitleI18n("ابقى على تواصل");
		websiteContactI18n2.setMessageI18n("رسالة");
		websiteContactI18n2.setNameI18n("اسم");
		websiteContactI18n2.setPageTitleI18n("أرسل لنا استفسارك في أي وقت");
		websiteContactI18n2.setPhoneSubtitleI18n("من الإثنين إلى الجمعة من الساعة 9 صباحًا حتى 6 مساءً");
		websiteContactI18n2.setSendI18n("يرسل");
		websiteContactI18n2.setSubjectI18n("الموضوع");
		websiteContactI18n2.setLang("AR");

		websiteContactI18n3.setEmailI18n("Correo electrónico");
		websiteContactI18n3.setEmailSubtitleI18n("Envíenos su consulta en cualquier momento");
		websiteContactI18n3.setFormTitleI18n("Póngase en contacto");
		websiteContactI18n3.setMessageI18n("Mensaje");
		websiteContactI18n3.setNameI18n("Nombre");
		websiteContactI18n3.setPageTitleI18n("Póngase en contacto");
		websiteContactI18n3.setPhoneSubtitleI18n("De lunes a viernes de 9 a. m. a 6 p. m.");
		websiteContactI18n3.setSendI18n("Enviar");
		websiteContactI18n3.setSubjectI18n("Asunto");
		websiteContactI18n3.setLang("ES");

		websiteContactI18n4.setEmailI18n("Email");
		websiteContactI18n4.setEmailSubtitleI18n("Envoyez-nous votre requête à tout moment");
		websiteContactI18n4.setFormTitleI18n("Entrez en contact");
		websiteContactI18n4.setMessageI18n("Message");
		websiteContactI18n4.setNameI18n("Nom");
		websiteContactI18n4.setPageTitleI18n("Entrez en contact");
		websiteContactI18n4.setPhoneSubtitleI18n("Lun au Ven 9h à 18h");
		websiteContactI18n4.setSendI18n("Envoyer");
		websiteContactI18n4.setSubjectI18n("Sujet");
		websiteContactI18n4.setLang("FR");

		websiteContactI18n5.setEmailI18n("E-Mail");
		websiteContactI18n5.setEmailSubtitleI18n("Senden Sie uns Ihre Anfrage jederzeit");
		websiteContactI18n5.setFormTitleI18n("Kontakt aufnehmen");
		websiteContactI18n5.setMessageI18n("Nachricht");
		websiteContactI18n5.setNameI18n("Name");
		websiteContactI18n5.setPageTitleI18n("Kontakt aufnehmen");
		websiteContactI18n5.setPhoneSubtitleI18n("Mo bis Fr 9:00 bis 18:00");
		websiteContactI18n5.setSendI18n("Senden");
		websiteContactI18n5.setSubjectI18n("Betreff");
		websiteContactI18n5.setLang("DE");

		websiteContactI18nRepository.save(websiteContactI18n);
		websiteContactI18nRepository.save(websiteContactI18n2);
		websiteContactI18nRepository.save(websiteContactI18n3);
		websiteContactI18nRepository.save(websiteContactI18n4);
		websiteContactI18nRepository.save(websiteContactI18n5);

	}

	private void insertBlogPage() {
		// TODO Auto-generated method stub
		websiteBlogI18n.setCategoryTitleI18n("Category");
		websiteBlogI18n.setEmailI18n("Email");
		websiteBlogI18n.setInstagramFeedI18n("Instagram Feeds");
		websiteBlogI18n.setNameSearchI18n("Search");
		websiteBlogI18n.setNewsletterTitleI18n("Newsletter");
		websiteBlogI18n.setPageTitleI18n("blog");
		websiteBlogI18n.setRecentPostI18n("Recent Post");
		websiteBlogI18n.setSearchButtonI18n("Search");
		websiteBlogI18n.setSendButtonI18n("Subsrcribe");
		websiteBlogI18n.setTagI18n("Tag Clouds");
		websiteBlogI18n.setLang("EN");

		websiteBlogI18n5.setCategoryTitleI18n("Kategorie");
		websiteBlogI18n5.setEmailI18n("E-Mail");
		websiteBlogI18n5.setInstagramFeedI18n("Instagram-Feeds");
		websiteBlogI18n5.setNameSearchI18n("Suche");
		websiteBlogI18n5.setNewsletterTitleI18n("Newsletter");
		websiteBlogI18n5.setPageTitleI18n("Blog");
		websiteBlogI18n5.setRecentPostI18n("Letzter Beitrag");
		websiteBlogI18n5.setSearchButtonI18n("Suchen");
		websiteBlogI18n5.setSendButtonI18n("Abonnieren");
		websiteBlogI18n5.setTagI18n("Tag-Wolken");
		websiteBlogI18n5.setLang("DE");

		websiteBlogI18n4.setCategoryTitleI18n("Catégorie");
		websiteBlogI18n4.setEmailI18n("Email");
		websiteBlogI18n4.setInstagramFeedI18n("Flux Instagram");
		websiteBlogI18n4.setNameSearchI18n("Rechercher");
		websiteBlogI18n4.setNewsletterTitleI18n("Newsletter");
		websiteBlogI18n4.setPageTitleI18n("blog");
		websiteBlogI18n4.setRecentPostI18n("Message récent");
		websiteBlogI18n4.setSearchButtonI18n("Rechercher");
		websiteBlogI18n4.setSendButtonI18n("S'abonner");
		websiteBlogI18n4.setTagI18n("Nuages de balises");
		websiteBlogI18n4.setLang("FR");

		websiteBlogI18n3.setCategoryTitleI18n("Categoría");
		websiteBlogI18n3.setEmailI18n("Correo electrónico");
		websiteBlogI18n3.setInstagramFeedI18n("Feeds de Instagram");
		websiteBlogI18n3.setNameSearchI18n("Buscar");
		websiteBlogI18n3.setNewsletterTitleI18n("Boletín");
		websiteBlogI18n3.setPageTitleI18n("blog");
		websiteBlogI18n3.setRecentPostI18n("Publicación reciente");
		websiteBlogI18n3.setSearchButtonI18n("Buscar");
		websiteBlogI18n3.setSendButtonI18n("Suscribirse");
		websiteBlogI18n3.setTagI18n("Nubes de etiquetas");
		websiteBlogI18n3.setLang("ES");

		websiteBlogI18n2.setCategoryTitleI18n("فئة");
		websiteBlogI18n2.setEmailI18n("بريد الالكتروني");
		websiteBlogI18n2.setInstagramFeedI18n("انستغرام");
		websiteBlogI18n2.setNameSearchI18n("بحث");
		websiteBlogI18n2.setNewsletterTitleI18n("النشرة");
		websiteBlogI18n2.setPageTitleI18n("مقالات");
		websiteBlogI18n2.setRecentPostI18n("المنشور الاخير");
		websiteBlogI18n2.setSearchButtonI18n("بحث");
		websiteBlogI18n2.setSendButtonI18n("الإشتراك");
		websiteBlogI18n2.setTagI18n("علامة الغيوم");
		websiteBlogI18n2.setLang("AR");

		websiteBlogI18nRepository.save(websiteBlogI18n);
		websiteBlogI18nRepository.save(websiteBlogI18n2);
		websiteBlogI18nRepository.save(websiteBlogI18n3);
		websiteBlogI18nRepository.save(websiteBlogI18n4);
		websiteBlogI18nRepository.save(websiteBlogI18n5);

	}

	private void insertAboutPage() {
		websiteAboutI18n.setPageTitleI18n("About Us");
		websiteAboutI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteAboutI18n.setLang("EN");

		websiteAboutI18n3.setPageTitleI18n("Acerca de nosotros");
		websiteAboutI18n3.setReservationSectionI18n("¿Para reserva o consulta?");
		websiteAboutI18n3.setLang("ES");

		websiteAboutI18n4.setPageTitleI18n("À propos de nous");
		websiteAboutI18n4.setReservationSectionI18n("Pour la réservation 0r la requête ?");
		websiteAboutI18n4.setLang("FR");

		websiteAboutI18n5.setPageTitleI18n("Über uns");
		websiteAboutI18n5.setReservationSectionI18n("Für Reservierung oder Abfrage?");
		websiteAboutI18n5.setLang("DE");

		websiteAboutI18n2.setPageTitleI18n("معلومات عنا");
		websiteAboutI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteAboutI18n2.setLang("AR");

		websiteAboutI18nRepository.save(websiteAboutI18n);
		websiteAboutI18nRepository.save(websiteAboutI18n2);
		websiteAboutI18nRepository.save(websiteAboutI18n3);
		websiteAboutI18nRepository.save(websiteAboutI18n4);
		websiteAboutI18nRepository.save(websiteAboutI18n5);

	}

	private void insertHomePage() {
		websiteHomeI18n.setAboutSectionTitleI18n("About Us");
		websiteHomeI18n.setBookButtonI18n("Book now");
		websiteHomeI18n.setOfferSectionSubTitleI18n("Ongoing Offers");
		websiteHomeI18n.setOfferSectionTitleI18n("Our Offers");
		websiteHomeI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteHomeI18n.setRoomSubTitleI18n("Choose a Better Room");
		websiteHomeI18n.setRoomTitleI18n("Featured Rooms");
		websiteHomeI18n.setVideoSubTitleI18n("Relax and Enjoy your Vacation ");
		websiteHomeI18n.setVideoTitleI18n("Hotel Reservation View");
		websiteHomeI18n.setLearnmoreButton("Learn more");
		websiteHomeI18n.setLang("EN");

		websiteHomeI18n5.setAboutSectionTitleI18n("Über uns");
		websiteHomeI18n5.setBookButtonI18n("Jetzt buchen");
		websiteHomeI18n5.setOfferSectionSubTitleI18n("Laufende Angebote");
		websiteHomeI18n5.setOfferSectionTitleI18n("Unsere Angebote");
		websiteHomeI18n5.setReservationSectionI18n("Für Reservierung oder Abfrage?");
		websiteHomeI18n5.setRoomSubTitleI18n("Wählen Sie ein besseres Zimmer");
		websiteHomeI18n5.setRoomTitleI18n("Empfohlene Räume");
		websiteHomeI18n5.setVideoSubTitleI18n("Entspannen Sie sich und genießen Sie Ihren Urlaub");
		websiteHomeI18n5.setVideoTitleI18n("Hotelreservierungsansicht");
		websiteHomeI18n5.setLearnmoreButton("Weitere Informationen");
		websiteHomeI18n5.setLang("DE");

		websiteHomeI18n4.setAboutSectionTitleI18n("À propos de nous");
		websiteHomeI18n4.setBookButtonI18n("Réserver maintenant");
		websiteHomeI18n4.setOfferSectionSubTitleI18n("Offres en cours");
		websiteHomeI18n4.setOfferSectionTitleI18n("Nos offres");
		websiteHomeI18n4.setReservationSectionI18n("Pour la réservation 0r la requête ?");
		websiteHomeI18n4.setRoomSubTitleI18n("Choisissez une meilleure chambre");
		websiteHomeI18n4.setRoomTitleI18n("Chambres en vedette");
		websiteHomeI18n4.setVideoSubTitleI18n("Détendez-vous et profitez de vos vacances");
		websiteHomeI18n4.setVideoTitleI18n("Vue de la réservation d'hôtel");
		websiteHomeI18n4.setLearnmoreButton("En savoir plus");
		websiteHomeI18n4.setLang("FR");

		websiteHomeI18n3.setAboutSectionTitleI18n("Acerca de nosotros");
		websiteHomeI18n3.setBookButtonI18n("Reserve ahora");
		websiteHomeI18n3.setOfferSectionSubTitleI18n("Ofertas en curso");
		websiteHomeI18n3.setOfferSectionTitleI18n("Nuestras ofertas");
		websiteHomeI18n3.setReservationSectionI18n("¿Para reserva o consulta?");
		websiteHomeI18n3.setRoomSubTitleI18n("Elija una habitación mejor");
		websiteHomeI18n3.setRoomTitleI18n("Habitaciones destacadas");
		websiteHomeI18n3.setVideoSubTitleI18n("Relájese y disfrute de sus vacaciones");
		websiteHomeI18n3.setVideoTitleI18n("Vista de reserva de hotel");
		websiteHomeI18n3.setLearnmoreButton("Más información");
		websiteHomeI18n3.setLang("ES");

		websiteHomeI18n2.setAboutSectionTitleI18n("معلومات عنا");
		websiteHomeI18n2.setBookButtonI18n("احجز الآن");
		websiteHomeI18n2.setOfferSectionSubTitleI18n("العروض الجارية");
		websiteHomeI18n2.setOfferSectionTitleI18n("عروضنا");
		websiteHomeI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteHomeI18n2.setRoomSubTitleI18n("اختر غرفة أفضل ");
		websiteHomeI18n2.setRoomTitleI18n("غرف مميزة");
		websiteHomeI18n2.setVideoSubTitleI18n("استرخ واستمتع بإجازتك ");
		websiteHomeI18n2.setLearnmoreButton("أعرف أكثر");
		websiteHomeI18n2.setVideoTitleI18n("عرض حجز الفندق");
		websiteHomeI18n2.setLang("AR");

		websiteHomeI18nRepository.save(websiteHomeI18n);
		websiteHomeI18nRepository.save(websiteHomeI18n2);
		websiteHomeI18nRepository.save(websiteHomeI18n3);
		websiteHomeI18nRepository.save(websiteHomeI18n4);
		websiteHomeI18nRepository.save(websiteHomeI18n5);

	}

	private void insertMenu() {
		websiteMenuI18n.setAboutItemI18n("About");
		websiteMenuI18n.setBlogItemI18n("Blog");
		websiteMenuI18n.setContactI18n("Contact");
		websiteMenuI18n.setHomeItemI18n("Home");
		websiteMenuI18n.setSignInI18n("Sign In");
		websiteMenuI18n.setRoomItemI18n("Rooms");
		websiteMenuI18n.setLang("EN");

		websiteMenu5I18n.setAboutItemI18n("Acerca de");
		websiteMenu5I18n.setBlogItemI18n("Blog");
		websiteMenu5I18n.setContactI18n("Contacto");
		websiteMenu5I18n.setHomeItemI18n("Inicio");
		websiteMenu5I18n.setSignInI18n("Iniciar sesión");
		websiteMenu5I18n.setRoomItemI18n("Habitaciones");
		websiteMenu5I18n.setLang("ES");

		websiteMenu4I18n.setAboutItemI18n("Über");
		websiteMenu4I18n.setBlogItemI18n("Blog");
		websiteMenu4I18n.setContactI18n("Kontakt");
		websiteMenu4I18n.setHomeItemI18n("Home");
		websiteMenu4I18n.setSignInI18n("Anmelden");
		websiteMenu4I18n.setRoomItemI18n("Räume");
		websiteMenu4I18n.setLang("DE");

		websiteMenu3I18n.setAboutItemI18n("À propos");
		websiteMenu3I18n.setBlogItemI18n("Blog");
		websiteMenu3I18n.setContactI18n("Contact");
		websiteMenu3I18n.setHomeItemI18n("Accueil");
		websiteMenu3I18n.setSignInI18n("Connexion");
		websiteMenu3I18n.setRoomItemI18n("Chambres");
		websiteMenu3I18n.setLang("FR");

		websiteMenu2I18n.setAboutItemI18n("حول");
		websiteMenu2I18n.setBlogItemI18n("مقالات");
		websiteMenu2I18n.setContactI18n("اتصال");
		websiteMenu2I18n.setRoomItemI18n("غرف");
		websiteMenu2I18n.setHomeItemI18n("الصفحة الرئيسية");
		websiteMenu2I18n.setSignInI18n("تسجيل الدخول");
		websiteMenu2I18n.setLang("AR");

		websiteMenuI18nRepository.save(websiteMenuI18n);
		websiteMenuI18nRepository.save(websiteMenu2I18n);
		websiteMenuI18nRepository.save(websiteMenu3I18n);
		websiteMenuI18nRepository.save(websiteMenu4I18n);
		websiteMenuI18nRepository.save(websiteMenu5I18n);

	}

}
