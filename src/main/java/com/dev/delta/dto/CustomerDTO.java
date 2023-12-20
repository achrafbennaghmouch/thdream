package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CustomerI18nRepository;
import com.dev.delta.repositories.CustomerRepository;

@Service
public class CustomerDTO implements DTO {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerI18nRepository customerI18nRepository;

	@Override
	public void populate() {
		customer.setAddress(faker.address().streetName());
		customer.setCity(city);
		customer.setMobile(faker.phoneNumber().cellPhone().toString());
		customer.setFullname(faker.name().fullName());
		customer.setEmail(faker.internet().emailAddress());
		customer.setUser(user1);

		customerRepository.save(customer);

		customer2.setAddress(faker.address().streetName());
		customer2.setCity(city);
		customer2.setMobile(faker.phoneNumber().cellPhone().toString());
		customer2.setFullname(faker.name().fullName());
		customer2.setEmail(faker.internet().emailAddress());
		customer2.setUser(user);
		customerRepository.save(customer2);

		customerI18n.setAddressI18n("Address");
		customerI18n.setCityI18n("City");
		customerI18n.setMobileI18n("Mobile");
		customerI18n.setFullnameI18n("Fullname");
		customerI18n.setEmailI18n("Email");
		customerI18n.setUserI18n("User");
		customerI18n.setLangI18n("EN");
		customerI18n.setGetTitleI18n("Customer");
		customerI18n.setCreateTitleI18n("Create");
		customerI18n.setEditTitleI18n("Edit");
		customerI18n.setGetAllTitleI18n("Customers");
		customerI18n.setAgeI18n("Age");
		customerI18n.setGenderI18n("Gender");
		customerI18n.setCountryI18n("Country");
		customerI18nRepository.save(customerI18n);

		customerI18n2.setAddressI18n("Anschrift");
		customerI18n2.setCityI18n("Stadt");
		customerI18n2.setMobileI18n("Handy");
		customerI18n2.setFullnameI18n("vollständiger Name");
		customerI18n2.setEmailI18n("Email");
		customerI18n2.setUserI18n("Benutzer");
		customerI18n2.setLangI18n("DE");
		customerI18n2.setGetTitleI18n("Kunde");
		customerI18n2.setCreateTitleI18n("Erstellen");
		customerI18n2.setEditTitleI18n("Bearbeiten");
		customerI18n2.setGetAllTitleI18n("Kunden");
		customerI18n2.setAgeI18n("Alter");
		customerI18n2.setGenderI18n("Geschlecht");
		customerI18n2.setCountryI18n("Land");

		customerI18n3.setAddressI18n("Adresse");
		customerI18n3.setCityI18n("Ville");
		customerI18n3.setMobileI18n("Mobile");
		customerI18n3.setFullnameI18n("Nom complet");
		customerI18n3.setEmailI18n("Email");
		customerI18n3.setUserI18n("Utilisateur");
		customerI18n3.setLangI18n("FR");
		customerI18n3.setGetTitleI18n("Client");
		customerI18n3.setCreateTitleI18n("Créer");
		customerI18n3.setEditTitleI18n("Editer");
		customerI18n3.setGetAllTitleI18n("Clients");
		customerI18n3.setAgeI18n("Age");
		customerI18n3.setGenderI18n("Sexe");
		customerI18n3.setCountryI18n("Pays");
		customerI18nRepository.save(customerI18n3);

		customerI18n4.setAddressI18n("العنوان");
		customerI18n4.setCityI18n("المدينة");
		customerI18n4.setMobileI18n("الجوال");
		customerI18n4.setFullnameI18n("الاسم الكامل");
		customerI18n4.setEmailI18n("البريد الإلكتروني");
		customerI18n4.setUserI18n("المستخدم");
		customerI18n4.setLangI18n("AR");
		customerI18n4.setGetTitleI18n("العميل");
		customerI18n4.setCreateTitleI18n("إنشاء");
		customerI18n4.setEditTitleI18n("تحرير");
		customerI18n4.setGetAllTitleI18n("العملاء");
		customerI18n4.setAgeI18n("العمر");
		customerI18n4.setGenderI18n("الجنس");
		customerI18n4.setCountryI18n("البلد");
		customerI18nRepository.save(customerI18n4);

		customerI18n5.setAddressI18n("Dirección");
		customerI18n5.setCityI18n("Ciudad");
		customerI18n5.setMobileI18n("Móvil");
		customerI18n5.setFullnameI18n("Nombre completo");
		customerI18n5.setEmailI18n("Correo electrónico");
		customerI18n5.setUserI18n("Usuario");
		customerI18n5.setLangI18n("ES");
		customerI18n5.setGetTitleI18n("Cliente");
		customerI18n5.setCreateTitleI18n("Crear");
		customerI18n5.setEditTitleI18n("Editar");
		customerI18n5.setGetAllTitleI18n("Clientes");
		customerI18n5.setAgeI18n("Edad");
		customerI18n5.setGenderI18n("Género");
		customerI18n5.setCountryI18n("País");
		customerI18nRepository.save(customerI18n5);

		customerI18nRepository.save(customerI18n2);
	}

}
