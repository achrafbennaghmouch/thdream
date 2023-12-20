package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.delta.entities.Notification;
import com.dev.delta.i18n.repositories.CheckInI18nRepository;

import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.services.CheckInService;

@Service
public class CheckInDTO implements DTO {

	@Autowired
	CheckInService checkInService;

	@Autowired
	CheckInI18nRepository checkInI18nRepository;

	@Autowired
	NotificationRepository notificationRepository;


	@Override
	public void populate() {
		Date dt = new Date();
		  dt.setMonth(11);
		Date dt2 = new Date();
		dt2.setMonth(12);

		checkIn.setCheckIn(dt.toString());
		checkIn.setCheckOut(dt2.toString());
		checkIn.setCity(city);
		checkIn.setCountry(country);
		checkIn.setFullname(faker.name().fullName());
		checkIn.setEmail(faker.internet().emailAddress());
		checkIn.setRoom(room);
		checkIn.setGuestType(guestType1);
		checkIn.setCutomer(customer);
		checkIn.setStatus("CheckIn");
		checkIn.setPaymentStatus("Paid");
		checkIn.setMobile(faker.phoneNumber().cellPhone().toString());
		checkIn.setAddress(faker.address().streetName());
		checkInService.save(checkIn);

		Notification notification = new Notification();
		notification.setDate(new Date().toString());
		notification.setName("New checkin added by " + checkIn.getFullname());
		notificationRepository.save(notification);



		checkInI18n.setCheckInI18n("Check In");
		checkInI18n.setCheckOutI18n("Check Out");
		checkInI18n.setCityI18n("City");
		checkInI18n.setCountryI18n("Country");
		checkInI18n.setFullnameI18n("Fullname");
		checkInI18n.setEmailI18n("Email");
		checkInI18n.setRoomI18n("Room");
		checkInI18n.setGuestTypeI18n("Guest Type");
		checkInI18n.setCutomerI18n("Customer");
		checkInI18n.setLangI18n("EN");
		checkInI18n.setGetTitleI18n("Check In");
		checkInI18n.setCreateTitleI18n("Create");
		checkInI18n.setEditTitleI18n("Edit ");
		checkInI18n.setGetAllTitleI18n("Check In");
		checkInI18n.setStatusI18n("Check In");
		checkInI18n.setPaymentStatusI18n("Payment Status");
		checkInI18n.setViewcheckinI18n("view");
		checkInI18n.setCheckoutbuttonI18n("Checkout");
		checkInI18n.setViewinvoiceI18n("Invoice");
		checkInI18n.setOrderfoodI18n("Order food");
		checkInI18n.setOrderlaundryI18n("Order Laundry");
		checkInI18n.setHousekeepingI18n("Order House keeping");
		checkInI18n.setExtrabedI18n("Order Extra Bed");
		checkInI18n.setDurationofStayI18n("Duration");
		checkInI18n.setRoomPlanI18n("Room plan");
		checkInI18n.setGenderI18n("Gender");
		checkInI18n.setAgeI18n("Age");
		checkInI18n.setBookedByI18n("Booked by");
		checkInI18n.setVehicleNumberI18n("Vehicule No");
		checkInI18n.setRemarkI18n("Remark");
		checkInI18n.setIDNoI18n("Id");
		checkInI18n.setNameOtherPersonI18n("Partner name");
		checkInI18n.setGenderOtherPersonI18n("Partner gender");
		checkInI18n.setAgeOtherPersonI18n("Partner age");
		checkInI18n.setAddressOtherPersonI18n("Partner address");
		checkInI18n.setIDNoOtherPersonI18n("Partner id");
		checkInI18n.setAdvancePaymentI18n("Advance payment");
		checkInI18n.setBasicInformationI18n("Basic information");
		checkInI18n.setBookingInformationI18n("Booking information");
		checkInI18n.setAdditionalInformationI18n("Additional Information");
		checkInI18n.setPasswordI18n("Password");
		checkInI18n.setUsernameI18n("Username");
		checkInI18n.setAddressI18n("Address");
		checkInI18n.setMessageI18n("I agree that the\r\n"
				+ "										information collected by this form will be stored in a\r\n"
				+ "										database in order to process my request. In accordance with\r\n"
				+ "										the \"General Data Protection Regulation\", you can exercise\r\n"
				+ "										your right to access to your data and make them rectified via\r\n"
				+ "										the contact form.");
		checkInI18n.setKidsI18n("Kids");
		checkInI18n.setAdultsI18n("Adults");
		checkInI18n.setMobileI18n("Mobile");
		checkInI18nRepository.save(checkInI18n);

		checkInI18n2.setCheckInI18n("Einchecken");
		checkInI18n2.setCheckOutI18n("Auschecken");
		checkInI18n2.setCityI18n("Stadt");
		checkInI18n2.setCountryI18n("Land");
		checkInI18n2.setFullnameI18n("Vollständiger Name");
		checkInI18n2.setEmailI18n("Email");
		checkInI18n2.setRoomI18n("Zimmer");
		checkInI18n2.setGuestTypeI18n("Kundentyp");
		checkInI18n2.setCutomerI18n("Kunde");
		checkInI18n2.setLangI18n("DE");
		checkInI18n2.setGetTitleI18n("Buchungen");
		checkInI18n2.setCreateTitleI18n("Erstellen");
		checkInI18n2.setEditTitleI18n("Bearbeiten");
		checkInI18n2.setGetAllTitleI18n("Buchungen");
		checkInI18n2.setStatusI18n("Check Out");
		checkInI18n2.setPaymentStatusI18n("Zahlungsstatus");
		checkInI18n2.setMobileI18n("Telefon");
		checkInI18n2.setAddressI18n("Anschrift");
		checkInI18n2.setAdultsI18n("Erwachsene");
		checkInI18n2.setKidsI18n("Kinder");
		checkInI18n2.setViewcheckinI18n("Ansehen");
		checkInI18n2.setCheckoutbuttonI18n("Auschecken");
		checkInI18n2.setViewinvoiceI18n("Rechnung");
		checkInI18n2.setOrderfoodI18n("Essen bestellen");
		checkInI18n2.setOrderlaundryI18n("Wäsche bestellen");
		checkInI18n2.setHousekeepingI18n("Hauswirtschaft bestellen");
		checkInI18n2.setExtrabedI18n("Extrabett bestellen");
		checkInI18n2.setDurationofStayI18n("Dauer");
		checkInI18n2.setRoomPlanI18n("Raumplan");
		checkInI18n2.setGenderI18n("Geschlecht");
		checkInI18n2.setAgeI18n("Alter");
		checkInI18n2.setBookedByI18n("gebucht von");
		checkInI18n2.setVehicleNumberI18n("Fahrzeug Nummer");
		checkInI18n2.setRemarkI18n("Hinweis");
		checkInI18n2.setIDNoI18n("Ausweis");
		checkInI18n2.setNameOtherPersonI18n("Partnername");
		checkInI18n2.setGenderOtherPersonI18n("Partner Geschlecht");
		checkInI18n2.setAgeOtherPersonI18n("Partner Alter");
		checkInI18n2.setAddressOtherPersonI18n("Partner anschrift");
		checkInI18n2.setIDNoOtherPersonI18n("Partner Ausweis");
		checkInI18n2.setAdvancePaymentI18n("Vorauszahlung");
		checkInI18n2.setBasicInformationI18n("Grundinformation");
		checkInI18n2.setBookingInformationI18n("Buchungsinformation");
		checkInI18n2.setAdditionalInformationI18n("Weitere Informationen");
		checkInI18n2.setPasswordI18n("Passwort");
		checkInI18n2.setUsernameI18n("Benutzername");
		checkInI18n2.setMessageI18n(
				"Ich stimme zu, dass die über dieses Formular erhobenen Daten zur Bearbeitung meiner Anfrage in einer Datenbank gespeichert werden. Gemäß der Datenschutz-Grundverordnung können Sie Ihr Recht auf Auskunft über Ihre Daten und deren Berichtigung über das Kontaktformular ausüben.");
		checkInI18n2.setAddressI18n("Anschrift");
		checkInI18n2.setKidsI18n("Kinder");
		checkInI18n2.setAdultsI18n("Erwachsene");
		checkInI18n2.setMobileI18n("Mobiltelefon");
		checkInI18nRepository.save(checkInI18n2);

		checkInI18n3.setCheckInI18n("وصول");
		checkInI18n3.setCheckOutI18n("مغادرة");
		checkInI18n3.setCityI18n("مدينة");
		checkInI18n3.setCountryI18n("دولة");
		checkInI18n3.setFullnameI18n("الاسم بالكامل");
		checkInI18n3.setEmailI18n("بريد الالكتروني");
		checkInI18n3.setRoomI18n("غرفة");
		checkInI18n3.setGuestTypeI18n("نوع الضيف");
		checkInI18n3.setCutomerI18n("عميل");
		checkInI18n3.setLangI18n("AR");
		checkInI18n3.setGetTitleI18n("الحجز");
		checkInI18n3.setCreateTitleI18n("إنشاء");
		checkInI18n3.setEditTitleI18n("تعديل");
		checkInI18n3.setGetAllTitleI18n("الحجز");
		checkInI18n3.setStatusI18n("تحقق في");
		checkInI18n3.setPaymentStatusI18n("مدفوع");
		checkInI18n3.setViewcheckinI18n("عرض");
		checkInI18n3.setCheckoutbuttonI18n("الدفع");
		checkInI18n3.setViewinvoiceI18n("فاتورة");
		checkInI18n3.setOrderfoodI18n("اطلب الطعام");
		checkInI18n3.setOrderlaundryI18n("اطلب الغسيل");
		checkInI18n3.setHousekeepingI18n("ترتيب التدبير المنزلي");
		checkInI18n3.setExtrabedI18n("اطلب سرير إضافي");
		checkInI18n3.setDurationofStayI18n("مدة");
		checkInI18n3.setRoomPlanI18n("خطة الغرفة");
		checkInI18n3.setGenderI18n("جنس تذكير أو تأنيث");
		checkInI18n3.setAgeI18n("سن");
		checkInI18n3.setBookedByI18n("حجز بواسطة");
		checkInI18n3.setVehicleNumberI18n("رقم المركبة");
		checkInI18n3.setRemarkI18n("ملاحظة");
		checkInI18n3.setIDNoI18n("هوية شخصية");
		checkInI18n3.setNameOtherPersonI18n("اسم شريك");
		checkInI18n3.setGenderOtherPersonI18n("جنس الشريك");
		checkInI18n3.setAgeOtherPersonI18n("عمر الشريك");
		checkInI18n3.setAddressOtherPersonI18n("عنوان الشريك");
		checkInI18n3.setIDNoOtherPersonI18n("معرف الشريك");
		checkInI18n3.setAdvancePaymentI18n("دفعه مقدمه");
		checkInI18n3.setBasicInformationI18n("معلومات اساسية");
		checkInI18n3.setBookingInformationI18n("معلومات الحجز");
		checkInI18n3.setAdditionalInformationI18n("معلومة اضافية");
		checkInI18n3.setAdultsI18n("الكبار");
		checkInI18n3.setKidsI18n("أطفال");
		checkInI18n3.setPasswordI18n("كلمة المرور");
		checkInI18n3.setUsernameI18n("اسم المستخدم");
		checkInI18n3.setMessageI18n(
				"أوافق على أن المعلومات التي تم جمعها بواسطة هذا النموذج سيتم تخزينها في قاعدة البيانات من أجل معالجة طلبي. وفقًا للائحة العامة لحماية البيانات ، يمكنك ممارسة حقك في الوصول إلى بياناتك وتصحيحها عبر نموذج الاتصال.");
		checkInI18n3.setAddressI18n("عنوان");
		checkInI18n3.setKidsI18n("أطفال");
		checkInI18n3.setAdultsI18n("الكبار");
		checkInI18n3.setMobileI18n("التليفون المحمول");

		checkInI18nRepository.save(checkInI18n3);

		checkInI18n4.setCheckInI18n("Registrar");
		checkInI18n4.setCheckOutI18n("Salida");
		checkInI18n4.setCityI18n("Ciudad");
		checkInI18n4.setCountryI18n("País");
		checkInI18n4.setFullnameI18n("Nombre completo");
		checkInI18n4.setEmailI18n("Correo electrónico");
		checkInI18n4.setRoomI18n("Habitación");
		checkInI18n4.setGuestTypeI18n("Tipo de invitado");
		checkInI18n4.setCutomerI18n("Cliente");
		checkInI18n4.setLangI18n("ES");
		checkInI18n4.setGetTitleI18n("reservaciones");
		checkInI18n4.setCreateTitleI18n("Crear ");
		checkInI18n4.setEditTitleI18n("Editar ");
		checkInI18n4.setGetAllTitleI18n("reservaciones");
		checkInI18n4.setStatusI18n("Registrar");
		checkInI18n4.setPaymentStatusI18n("Pagado");
		checkInI18n4.setViewcheckinI18n("ver");
		checkInI18n4.setCheckoutbuttonI18n("Pago");
		checkInI18n4.setViewinvoiceI18n("Factura");
		checkInI18n4.setOrderfoodI18n("Pedir comida");
		checkInI18n4.setOrderlaundryI18n("Solicitar lavandería");
		checkInI18n4.setHousekeepingI18n("Orden de mantenimiento de la casa");
		checkInI18n4.setExtrabedI18n("Solicitar cama adicional");
		checkInI18n4.setDurationofStayI18n("Duración");
		checkInI18n4.setRoomPlanI18n("Plano de la habitación");
		checkInI18n4.setGenderI18n("Género");
		checkInI18n4.setAgeI18n("Edad");
		checkInI18n4.setBookedByI18n("Reservado por");
		checkInI18n4.setVehicleNumberI18n("Vehículo No");
		checkInI18n4.setRemarkI18n("Observación");
		checkInI18n4.setIDNoI18n("Id");
		checkInI18n4.setNameOtherPersonI18n("Nombre del socio");
		checkInI18n4.setGenderOtherPersonI18n("Sexo del socio");
		checkInI18n4.setAgeOtherPersonI18n("Edad del socio");
		checkInI18n4.setAddressOtherPersonI18n("Dirección del socio");
		checkInI18n4.setIDNoOtherPersonI18n("ID de socio");
		checkInI18n4.setAdvancePaymentI18n("Pago por adelantado");
		checkInI18n4.setBasicInformationI18n("Información básica");
		checkInI18n4.setBookingInformationI18n("Información de reserva");
		checkInI18n4.setAdditionalInformationI18n("Información adicional");
		checkInI18n4.setPasswordI18n("Contraseña");
		checkInI18n4.setUsernameI18n("Nombre de usario");
		checkInI18n4.setMessageI18n(
				"Estoy de acuerdo en que \\r \\n la información recopilada por este formulario se almacenará en  base de datos para procesar mi solicitud. De acuerdo con\"\r\n"
						+ "				+ \"  Reglamento general de protección de datos  puede ejercer su derecho a acceder a sus datos y rectificarlos a través de \\r \\ n el formulario de contacto");
		checkInI18n4.setAddressI18n("Dirección");
		checkInI18n4.setKidsI18n("Niños");
		checkInI18n4.setAdultsI18n("Adultos");
		checkInI18n4.setMobileI18n("Móvil");

		checkInI18nRepository.save(checkInI18n4);

		checkInI18n.setCheckInI18n("Enregistrement");
		checkInI18n.setCheckOutI18n("Extraire");
		checkInI18n5.setCityI18n("Ville");
		checkInI18n5.setCountryI18n("Pays");
		checkInI18n5.setFullnameI18n("Fullname");
		checkInI18n5.setEmailI18n("E-mail");
		checkInI18n5.setRoomI18n("Chambre");
		checkInI18n5.setGuestTypeI18n("Type d'invité");
		checkInI18n5.setCutomerI18n("Client");
		checkInI18n5.setLangI18n("FR");
		checkInI18n5.setGetTitleI18n("Enregistrement");
		checkInI18n5.setCreateTitleI18n("Créer");
		checkInI18n5.setEditTitleI18n("Modifier");
		checkInI18n5.setGetAllTitleI18n("Enregistrement");
		checkInI18n5.setStatusI18n("Enregistrement");
		checkInI18n5.setPaymentStatusI18n("Paiement");
		checkInI18n5.setViewcheckinI18n("vue");
		checkInI18n5.setCheckoutbuttonI18n("Checkout");
		checkInI18n5.setViewinvoiceI18n("Facture");
		checkInI18n5.setOrderfoodI18n("Commander de la nourriture");
		checkInI18n5.setOrderlaundryI18n("Commander la lessive");
		checkInI18n5.setHousekeepingI18n("Commander Housekeeping");
		checkInI18n5.setExtrabedI18n("Commander un lit supplémentaire");
		checkInI18n5.setDurationofStayI18n("Durée");
		checkInI18n5.setRoomPlanI18n("Plan de la pièce");
		checkInI18n5.setGenderI18n("Sexe");
		checkInI18n5.setAgeI18n("Âge");
		checkInI18n5.setBookedByI18n("Réservé par");
		checkInI18n5.setVehicleNumberI18n("N° de véhicule");
		checkInI18n5.setRemarkI18n("Remarque");
		checkInI18n5.setIDNoI18n("Id");
		checkInI18n5.setNameOtherPersonI18n("Nom du partenaire");
		checkInI18n5.setGenderOtherPersonI18n("Sexe du partenaire");
		checkInI18n5.setAgeOtherPersonI18n("Âge du partenaire");
		checkInI18n5.setAddressOtherPersonI18n("Adresse du partenaire");
		checkInI18n5.setIDNoOtherPersonI18n("ID partenaire");
		checkInI18n5.setAdvancePaymentI18n("Paiement anticipé");
		checkInI18n5.setBasicInformationI18n("Informations de base");
		checkInI18n5.setBookingInformationI18n("Informations de réservation");
		checkInI18n5.setAdditionalInformationI18n("Informations supplémentaires");
		checkInI18n5.setPasswordI18n("mot de passe");
		checkInI18n5.setUsernameI18n("Nom de utilisateur");
		checkInI18n5.setMessageI18n("Je suis d'accord que le\r\n"
				+ " les informations recueillies par ce formulaire seront stockées dans un\r\n"
				+ " base de données afin de traiter ma demande. Conformément à\r\n"
				+ " le \"Règlement Général sur la Protection des Données\", vous pouvez exercer\r\n"
				+ " votre droit d'accéder à vos données et de les faire rectifier via\r\n"
				+ " le formulaire de contact.");
		checkInI18n5.setAddressI18n("Adresse");
		checkInI18n5.setKidsI18n("Enfants");
		checkInI18n5.setAdultsI18n("Adultes");
		checkInI18n5.setMobileI18n("Téléphone");
		checkInI18nRepository.save(checkInI18n5);
	}

}
