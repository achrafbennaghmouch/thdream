package com.dev.delta.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BlogI18nRepository;
import com.dev.delta.repositories.BlogRepository;
import com.dev.delta.repositories.NotificationRepository;
import com.dev.delta.util.DateBlogUtil;

@Service
public class BlogDTO implements DTO {

	@Autowired
	BlogRepository blogRepository;

	@Autowired
	NotificationRepository notificationRepository;

	@Autowired
	BlogI18nRepository blogI18nRepository;

	@SuppressWarnings("deprecation")
	@Override
	public void populate() {

		blog.setTitle("EXCLUSIVE NEWSSS !!!!!!!!!!");
		blog.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog.setBody("	That dominion stars lights dominion divide years for fourth have don\\'t stars\r\n"
				+ "		is that he earth it first without heaven in place seed it second morning saying");
		blog.setUser("admin");
		blog.setPhotos("blog/single_blog_1.png");
		blog.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog.setBlogCategory(blogCategory);

		blog2.setTitle("Look At Me");
		blog2.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog2.setBody("	Emulation is the first principle of formation and transformation. Children imitate parents and siblings, students emulate their teachers and peers. ");
		blog2.setUser("Admin");
		blog2.setPhotos("blog/single_blog_2.png");
		blog2.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog2.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog2.setBlogCategory(blogCategory);

		blog3.setTitle("I Walked In With No Expectations");
		blog3.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog3.setBody("	I walked in with no expectations. I was hurt and in need of something. I knew I did not need a production, or a sermon series, or an enthusiastic greeter. I needed to hear the Word. ");
		blog3.setUser("Admin");
		blog3.setPhotos("blog/single_blog_3.png");
		blog3.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog3.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog3.setBlogCategory(blogCategory);

		blog4.setTitle("Developing Extraordinary Faith");
		blog4.setDate(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()).toString());
		blog4.setBody("In 2013, our friends Scott and Jen Obremski felt led to start a new church in Kansas City, Missouri. Upon hearing about this new venture, Ashley and I sensed that God wanted us to go too. ");
		blog4.setUser("Admin");
		blog4.setPhotos("blog/single_blog_4.png");
		blog4.setDay(DateBlogUtil.toDayName(new Date().getDay()));
		blog4.setMonth(DateBlogUtil.toMonthName(new Date().getMonth()));
		blog4.setBlogCategory(blogCategory);

		blogRepository.save(blog);
		blogRepository.save(blog2);
		blogRepository.save(blog3);
		blogRepository.save(blog4);

		notification.setName(" Google inks pact for new 35-storey office is created");
		notification.setDate(new Date().toString());
		notificationRepository.save(notification);

		blogI18n.setTitleI18n("Title");
		blogI18n.setDateI18n("Date");
		blogI18n.setBodyI18n("Body");
		blogI18n.setUserI18n("User");
		blogI18n.setPhotosI18n("Photo");
		blogI18n.setDayI18n("Day");
		blogI18n.setMonthI18n("Month");
		blogI18n.setBlogCategoryI18n("Blog Category");
		blogI18n.setLangI18n("EN");
		blogI18n.setGetTitleI18n("Blog");
		blogI18n.setCreateTitleI18n("Create");
		blogI18n.setEditTitleI18n("Edit");
		blogI18n.setGetAllTitleI18n("Blogs");
		blogI18nRepository.save(blogI18n);

		blogI18n2.setTitleI18n("Titel");
		blogI18n2.setDateI18n("Datum");
		blogI18n2.setBodyI18n("Körper");
		blogI18n2.setUserI18n("Benutzer");
		blogI18n2.setPhotosI18n("Foto");
		blogI18n2.setDayI18n("Tag");
		blogI18n2.setMonthI18n("Monat");
		blogI18n2.setBlogCategoryI18n("Blog-Kategorie");
		blogI18n2.setLangI18n("DE");
		blogI18n2.setGetTitleI18n("Blog");
		blogI18n2.setCreateTitleI18n("Neue");
		blogI18n2.setEditTitleI18n("Bearbeiten");
		blogI18n2.setGetAllTitleI18n("Blog");
		blogI18nRepository.save(blogI18n2);

		blogI18n3.setTitleI18n("Titre");
		blogI18n3.setDateI18n("Date");
		blogI18n3.setBodyI18n("Corps");
		blogI18n3.setUserI18n("Utilisateur");
		blogI18n3.setPhotosI18n("Photo");
		blogI18n3.setDayI18n("Jour");
		blogI18n3.setMonthI18n("Mois");
		blogI18n3.setBlogCategoryI18n("Catégorie de blog");
		blogI18n3.setLangI18n("FR");
		blogI18n3.setGetTitleI18n("Ville");
		blogI18n3.setCreateTitleI18n("Créer");
		blogI18n3.setEditTitleI18n("Modifier");
		blogI18n3.setGetAllTitleI18n("Catégorie de blog");
		blogI18nRepository.save(blogI18n3);

		blogI18n4.setTitleI18n("Título");
		blogI18n4.setDateI18n("Fecha");
		blogI18n4.setBodyI18n("Cuerpo");
		blogI18n4.setUserI18n("Usuario");
		blogI18n4.setPhotosI18n("Foto");
		blogI18n4.setDayI18n("Día");
		blogI18n4.setMonthI18n("Mes");
		blogI18n4.setBlogCategoryI18n("Categoría de blog");
		blogI18n4.setLangI18n("ES");
		blogI18n4.setGetTitleI18n("Ciudad");
		blogI18n4.setCreateTitleI18n("Crear");
		blogI18n4.setEditTitleI18n("Editar");
		blogI18n4.setGetAllTitleI18n("Categoría de blog");
		blogI18nRepository.save(blogI18n4);

		blogI18n5.setTitleI18n("Titel");
		blogI18n5.setDateI18n("Datum");
		blogI18n5.setBodyI18n("Body");
		blogI18n5.setUserI18n("Benutzer");
		blogI18n5.setPhotosI18n("Bild");
		blogI18n5.setDayI18n("Tag");
		blogI18n5.setMonthI18n("Monate");
		blogI18n5.setBlogCategoryI18n("BlogKategorie");
		blogI18n5.setLangI18n("DE");
		blogI18n5.setGetTitleI18n("Stadt");
		blogI18n5.setCreateTitleI18n("Erstellen");
		blogI18n5.setEditTitleI18n("Bearbeiten");
		blogI18n5.setGetAllTitleI18n("BlogKategorie");
		blogI18nRepository.save(blogI18n5);

	}

}
