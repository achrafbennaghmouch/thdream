package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExpenseI18nRepository;
import com.dev.delta.services.ExpenseService;

@Service
public class ExpenseDTO implements DTO {

	@Autowired
	ExpenseService expenseService;

	@Autowired
	ExpenseI18nRepository expenseI18nRepository;

	@Override
	public void populate() {
		expense.setName("Buy new Beds");
		expense.setRemark("  ");
		expense.setDate(new Date().toString());
		expense.setCategory(expenseCategory);
		expense.setAmount("1000");

		expenseService.save(expense);

		expenseI18n.setNameI18n("Name");
		expenseI18n.setRemarkI18n("Remark");
		expenseI18n.setDateI18n("Date");
		expenseI18n.setCategoryI18n("Category");
		expenseI18n.setAmountI18n("Amount");
		expenseI18n.setGetTitleI18n("Expense");
		expenseI18n.setCreateTitleI18n("Create");
		expenseI18n.setEditTitleI18n("Edit");
		expenseI18n.setGetAllTitleI18n("Expenses");
		expenseI18n.setLangI18n("EN");
		expenseI18nRepository.save(expenseI18n);

		expenseI18n2.setNameI18n("Name");
		expenseI18n2.setRemarkI18n("Anmerkung");
		expenseI18n2.setDateI18n("Datum");
		expenseI18n2.setCategoryI18n("Kategorie");
		expenseI18n2.setAmountI18n("Betragen");
		expenseI18n2.setGetTitleI18n("Ausgaben");
		expenseI18n2.setCreateTitleI18n("Erstellen");
		expenseI18n2.setEditTitleI18n("Bearbeiten");
		expenseI18n2.setGetAllTitleI18n("Ausgaben");
		expenseI18n2.setLangI18n("DE");
		expenseI18nRepository.save(expenseI18n2);

		expenseI18n3.setNameI18n("الاسم");
		expenseI18n3.setRemarkI18n("ملاحظة");
		expenseI18n3.setDateI18n("التاريخ");
		expenseI18n3.setCategoryI18n("الفئة");
		expenseI18n3.setAmountI18n("المبلغ");
		expenseI18n3.setGetTitleI18n("المصاريف");
		expenseI18n3.setCreateTitleI18n("إنشاء");
		expenseI18n3.setEditTitleI18n("تحرير");
		expenseI18n3.setGetAllTitleI18n("المصاريف");
		expenseI18n3.setLangI18n("AR");
		expenseI18nRepository.save(expenseI18n3);

		expenseI18n4.setNameI18n("Nom");
		expenseI18n4.setRemarkI18n("Remarque");
		expenseI18n4.setDateI18n("Date");
		expenseI18n4.setCategoryI18n("Catégorie");
		expenseI18n4.setAmountI18n("Montant");
		expenseI18n4.setGetTitleI18n("Dépense");
		expenseI18n4.setCreateTitleI18n("Créer");
		expenseI18n4.setEditTitleI18n("Modifier");
		expenseI18n4.setGetAllTitleI18n("Dépenses");
		expenseI18n4.setLangI18n("FR");
		expenseI18nRepository.save(expenseI18n4);

		expenseI18n5.setNameI18n("Nombre");
		expenseI18n5.setRemarkI18n("Observación");
		expenseI18n5.setDateI18n("Fecha");
		expenseI18n5.setCategoryI18n("Categoría");
		expenseI18n5.setAmountI18n("Cantidad");
		expenseI18n5.setGetTitleI18n("Gastos");
		expenseI18n5.setCreateTitleI18n("Crear");
		expenseI18n5.setEditTitleI18n("Editar");
		expenseI18n5.setGetAllTitleI18n("Gastos");
		expenseI18n5.setLangI18n("ES");
		expenseI18nRepository.save(expenseI18n5);

	}

}
