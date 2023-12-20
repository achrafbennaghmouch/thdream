package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.UIHeaderI18nRepository;

@Service
public class HeaderDTO implements DTO {

	@Autowired
	UIHeaderI18nRepository headerI18nRepository;

	@Override
	public void populate() {

		headerI18n.setBodymessage(" has sent an order from room number");
		headerI18n.setMessageone("You have ");
		headerI18n.setMessagetwoextrabed(" new extra bed orders");
		headerI18n.setMessagetwofood(" new food orders");
		headerI18n.setMessagetwohousekeeping(" new house keeping orders");
		headerI18n.setMessagetwolaundry(" new laundry orders");
		headerI18n.setMessagetwomessage(" new messages");
		headerI18n.setMessagetwonotification(" new notifications");
		headerI18n.setViewallbutton("view all");
		headerI18n.setLang("EN");

		headerI18n2.setBodymessage("hat eine Bestellung von Zimmernummer gesendet ");
		headerI18n2.setMessageone("Sie haben ");
		headerI18n2.setMessagetwoextrabed(" neue Zustellbettbestellungen");
		headerI18n2.setMessagetwofood(" neue Essensbestellungen");
		headerI18n2.setMessagetwohousekeeping(" neue Haushaltsordnungen");
		headerI18n2.setMessagetwolaundry(" neue wäschereibestellungen");
		headerI18n2.setMessagetwomessage(" neue Nachrichten");
		headerI18n2.setMessagetwonotification(" neue Benachrichtigungen");
		headerI18n2.setViewallbutton("alle anzeigen");
		headerI18n2.setLang("DE");

		headerI18n3.setBodymessage("أرسل طلبًا من رقم الغرفة");
		headerI18n3.setMessageone("لديك");
		headerI18n3.setMessagetwoextrabed("طلبات سرير إضافية جديدة");
		headerI18n3.setMessagetwofood("طلبات الطعام الجديدة");
		headerI18n3.setMessagetwohousekeeping("أوامر التدبير المنزلي الجديدة");
		headerI18n3.setMessagetwolaundry("أوامر غسيل جديدة");
		headerI18n3.setMessagetwomessage("رسائل جديدة");
		headerI18n3.setMessagetwonotification("إخطارات جديدة");
		headerI18n3.setViewallbutton("عرض الكل");
		headerI18n3.setLang("AR");

		headerI18n4.setBodymessage(" a envoyé une commande depuis le numéro de chambre ");
		headerI18n4.setMessageone("Vous avez ");
		headerI18n4.setMessagetwoextrabed("nouvelles commandes de lits supplémentaires");
		headerI18n4.setMessagetwofood("nouvelles commandes de nourriture");
		headerI18n4.setMessagetwohousekeeping("nouvelles commandes de tenue de maison");
		headerI18n4.setMessagetwolaundry("nouvelles commandes de blanchisserie");
		headerI18n4.setMessagetwomessage("nouveaux messages");
		headerI18n4.setMessagetwonotification("nouvelles notifications");
		headerI18n4.setViewallbutton("afficher tout");
		headerI18n4.setLang("FR");

		headerI18n5.setBodymessage("ha enviado un pedido desde el número de habitación");
		headerI18n5.setMessageone("Tiene");
		headerI18n5.setMessagetwoextrabed("nuevos pedidos de camas supletorias");
		headerI18n5.setMessagetwofood("nuevos pedidos de comida");
		headerI18n5.setMessagetwohousekeeping("nuevas órdenes de limpieza");
		headerI18n5.setMessagetwolaundry("nuevos pedidos de lavandería");
		headerI18n5.setMessagetwomessage("mensajes nuevos");
		headerI18n5.setMessagetwonotification("notificaciones nuevas");
		headerI18n5.setViewallbutton("ver todo");
		headerI18n5.setLang("ES");

		headerI18nRepository.save(headerI18n);
		headerI18nRepository.save(headerI18n2);
		headerI18nRepository.save(headerI18n3);
		headerI18nRepository.save(headerI18n4);
		headerI18nRepository.save(headerI18n5);

	}

}
