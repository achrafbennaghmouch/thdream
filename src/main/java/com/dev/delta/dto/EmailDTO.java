package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.email.EmailSettingRepository;
import com.dev.delta.i18n.repositories.EmailI18nRepository;

@Service
public class EmailDTO implements DTO {

	@Autowired
	EmailSettingRepository emailSettingRepository;

	@Autowired
	EmailI18nRepository emailI18nRepository;

	@Override
	public void populate() {
		emailSetting.setAuth("true");
		emailSetting.setEnableTLS("true");
		emailSetting.setHost("smtp.gmail.com");
		emailSetting.setEmail("587");
		emailSetting.setPort("");
		emailSetting.setPassword("");

		emailSettingRepository.save(emailSetting);

		emailI18n.setAuthI18n("Auth");
		emailI18n.setEnableTLS("Enable TLS");
		emailI18n.setHost("Host Name");
		emailI18n.setEmailI18n("Email");
		emailI18n.setPort("Port Number");
		emailI18n.setPasswordI18n("Password");
		emailI18n.setGetAllTitleI18n("Email Settings");
		emailI18n.setCreateTitleI18n("Create");
		emailI18n.setEditTitleI18n("Edit");
		emailI18n.setGetTitleI18n("Email Setting");
		emailI18n.setLangI18n("EN");
		emailI18nRepository.save(emailI18n);

		emailI18n2.setAuthI18n("Auth");
		emailI18n2.setEnableTLS(" TLS");
		emailI18n2.setHost("Gastgebername");
		emailI18n2.setEmailI18n("Email");
		emailI18n2.setPort("Port-Nummer");
		emailI18n2.setPasswordI18n("Passwort");
		emailI18n2.setGetAllTitleI18n("Email Einstellungen");
		emailI18n2.setCreateTitleI18n("Erstellen");
		emailI18n2.setEditTitleI18n("Bearbeiten");
		emailI18n2.setGetTitleI18n("Email Einstellungen");
		emailI18n2.setLangI18n("DE");
		emailI18nRepository.save(emailI18n2);

		emailI18n3.setAuthI18n("Auth");
		emailI18n3.setEnableTLS("Activer TLS");
		emailI18n3.setHost("Nom d'hôte");
		emailI18n3.setEmailI18n("Email");
		emailI18n3.setPort("Numéro de port");
		emailI18n3.setPasswordI18n("Mot de passe");
		emailI18n3.setGetAllTitleI18n("Paramètres de messagerie");
		emailI18n3.setCreateTitleI18n("Créer");
		emailI18n3.setEditTitleI18n("Modifier");
		emailI18n3.setGetTitleI18n("Paramètres de messagerie");
		emailI18n3.setLangI18n("FR");
		emailI18nRepository.save(emailI18n3);

		emailI18n4.setAuthI18n("Auth");
		emailI18n4.setEnableTLS("Habilitar TLS");
		emailI18n4.setHost("Nombre de host");
		emailI18n4.setEmailI18n("Correo electrónico");
		emailI18n4.setPort("Número de puerto");
		emailI18n4.setPasswordI18n("Contraseña");
		emailI18n4.setGetAllTitleI18n("Configuración de correo electrónico");
		emailI18n4.setCreateTitleI18n("Crear");
		emailI18n4.setEditTitleI18n("Editar");
		emailI18n4.setGetTitleI18n("Configuración de correo electrónico");
		emailI18n4.setLangI18n("ES");
		emailI18nRepository.save(emailI18n4);

		emailI18n5.setAuthI18n("Auth");
		emailI18n5.setEnableTLS("تمكين TLS");
		emailI18n5.setHost("اسم المضيف");
		emailI18n5.setEmailI18n("Email");
		emailI18n5.setPort("رقم المنفذ");
		emailI18n5.setPasswordI18n("كلمة المرور");
		emailI18n5.setGetAllTitleI18n("إعدادات البريد الإلكتروني");
		emailI18n5.setCreateTitleI18n("إنشاء مدينة جديدة");
		emailI18n5.setEditTitleI18n("تحرير إعدادات البريد الإلكتروني");
		emailI18n5.setGetTitleI18n("إعداد البريد الإلكتروني");
		emailI18n5.setLangI18n("AR");
		emailI18nRepository.save(emailI18n5);

	}

}
