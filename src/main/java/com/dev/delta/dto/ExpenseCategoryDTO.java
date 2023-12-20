package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExpenseCategoryI18nRepository;
import com.dev.delta.repositories.ExpenseCategoryRepository;

@Service
public class ExpenseCategoryDTO implements DTO {

	@Autowired
	ExpenseCategoryRepository expenseCategoryRepository;

	@Autowired
	ExpenseCategoryI18nRepository expenseCategoryI18nRepository;

	@Override
	public void populate() {
		expenseCategory.setCategoryName("Fourniture");
		expenseCategory2.setCategoryName("Repair");
		expenseCategoryRepository.save(expenseCategory);
		expenseCategoryRepository.save(expenseCategory2);

		expenseCategoryI18n.setCategoryNameI18n("Category");
		expenseCategoryI18n.setLangI18n("EN");
		expenseCategoryI18n.setGetTitleI18n("Expense Category");
		expenseCategoryI18n.setCreateTitleI18n("Create");
		expenseCategoryI18n.setEditTitleI18n("Edit");
		expenseCategoryI18n.setGetAllTitleI18n("Expense Categories");
		expenseCategoryI18nRepository.save(expenseCategoryI18n);

		expenseCategoryI18n2.setCategoryNameI18n("Kategorie");
		expenseCategoryI18n2.setLangI18n("DE");
		expenseCategoryI18n2.setGetTitleI18n("Ausgabenkategorie");
		expenseCategoryI18n2.setCreateTitleI18n("Erstellen");
		expenseCategoryI18n2.setEditTitleI18n("Bearbeiten");
		expenseCategoryI18n2.setGetAllTitleI18n("Ausgabenkategorie");
		expenseCategoryI18nRepository.save(expenseCategoryI18n2);

		expenseCategoryI18n3.setCategoryNameI18n("Categoría");
		expenseCategoryI18n3.setLangI18n("ES");
		expenseCategoryI18n3.setGetTitleI18n("Categoría de gastos");
		expenseCategoryI18n3.setCreateTitleI18n("Crear");
		expenseCategoryI18n3.setEditTitleI18n("Editar");
		expenseCategoryI18n3.setGetAllTitleI18n("Categorías de gastos");
		expenseCategoryI18nRepository.save(expenseCategoryI18n3);

		expenseCategoryI18n4.setCategoryNameI18n("Catégorie");
		expenseCategoryI18n4.setLangI18n("FR");
		expenseCategoryI18n4.setGetTitleI18n("Catégorie de dépenses");
		expenseCategoryI18n4.setCreateTitleI18n("Créer");
		expenseCategoryI18n4.setEditTitleI18n("Modifier");
		expenseCategoryI18n4.setGetAllTitleI18n("Catégories de dépenses");
		expenseCategoryI18nRepository.save(expenseCategoryI18n4);

		expenseCategoryI18n5.setCategoryNameI18n("الفئة");
		expenseCategoryI18n5.setLangI18n("AR");
		expenseCategoryI18n5.setGetTitleI18n("فئة المصاريف");
		expenseCategoryI18n5.setCreateTitleI18n("إنشاء");
		expenseCategoryI18n5.setEditTitleI18n("تحرير");
		expenseCategoryI18n5.setGetAllTitleI18n("فئات المصاريف");
		expenseCategoryI18nRepository.save(expenseCategoryI18n5);
	}

}
