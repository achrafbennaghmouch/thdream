package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.UserI18nRepository;
import com.dev.delta.repositories.UserRepository;

@Service
public class UserDTO implements DTO {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserI18nRepository userI18nRepository;

	@Override
	public void populate() {

		user.setUsername("admin");
		user.setPassword("admin");
		user.setRole(role);
		userRepository.save(user);

		user1.setUsername("employee");
		user1.setPassword("employee");
		user1.setRole(role2);
		userRepository.save(user1);

		user3.setUsername("reception");
		user3.setPassword("reception");
		user3.setRole(role3);
		userRepository.save(user3);

		userI18n.setRoleI18n("Role");
		userI18n.setUsernameI18n("Username");
		userI18n.setLangI18n("EN");
		userI18n.setGetAllTitleI18n("Users");
		userI18n.setCreateTitleI18n("Create ");
		userI18n.setEditTitleI18n("Edit ");
		userI18n.setGetTitleI18n("User");
		userI18nRepository.save(userI18n);

		userI18n2.setRoleI18n("Rolle");
		userI18n2.setUsernameI18n("Nutzername");
		userI18n2.setLangI18n("DE");
		userI18n2.setGetAllTitleI18n("Benutzer");
		userI18n2.setCreateTitleI18n("Erstellen");
		userI18n2.setEditTitleI18n("Bearbeiten");
		userI18n2.setGetTitleI18n("Benutzer");

		userI18nRepository.save(userI18n2);

		userI18n3.setRoleI18n("الدور");
		userI18n3.setUsernameI18n("اسم المستخدم");
		userI18n3.setLangI18n("AR");
		userI18n3.setGetAllTitleI18n("المستخدم");
		userI18n3.setCreateTitleI18n("إنشاء ");
		userI18n3.setEditTitleI18n("تحرير ");
		userI18n3.setGetTitleI18n("المستخدم");
		userI18nRepository.save(userI18n3);

		userI18n4.setRoleI18n("Rol");
		userI18n4.setUsernameI18n("Nombre de usuario");
		userI18n4.setLangI18n("ES");
		userI18n4.setGetAllTitleI18n("Usarios");
		userI18n4.setCreateTitleI18n("Crear ");
		userI18n4.setEditTitleI18n("Editar ");
		userI18n4.setGetTitleI18n("Usario");
		userI18nRepository.save(userI18n4);

		userI18n5.setRoleI18n("Rôle");
		userI18n5.setUsernameI18n("Username");
		userI18n5.setLangI18n("FR");
		userI18n5.setGetAllTitleI18n("Utilisateur");
		userI18n5.setCreateTitleI18n("Créer");
		userI18n5.setEditTitleI18n("Modifier");
		userI18n5.setGetTitleI18n("Utilisateur");
		userI18nRepository.save(userI18n5);

	}

}
