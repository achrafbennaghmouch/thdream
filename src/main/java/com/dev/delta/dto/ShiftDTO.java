package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ShiftI18nRepository;
import com.dev.delta.services.ShiftService;

@Service
public class ShiftDTO implements DTO {

	@Autowired
	ShiftService shiftService;

	@Autowired
	ShiftI18nRepository shiftI18nRepository;

	@Override
	public void populate() {
		shift.setEnd("00:00");
		shift.setStart("06:00");
		shift.setType("Night Shift");
		shiftService.save(shift);

		shiftI18n.setStartI18n("Start");
		shiftI18n.setEndI18n("End");
		shiftI18n.setTypeI18n("Type");
		shiftI18n.setGetTitleI18n("Shift");
		shiftI18n.setCreateTitleI18n("Create");
		shiftI18n.setEditTitleI18n("Edit");
		shiftI18n.setGetAllTitleI18n("Shifts");
		shiftI18n.setLangI18n("EN");

		shiftI18n2.setStartI18n("Anfang");
		shiftI18n2.setEndI18n("Ende");
		shiftI18n2.setTypeI18n("Typ");
		shiftI18n2.setGetTitleI18n("Verschieben");
		shiftI18n2.setCreateTitleI18n("Erstellen");
		shiftI18n2.setEditTitleI18n("Bearbeiten");
		shiftI18n2.setGetAllTitleI18n("Verschiebungen");
		shiftI18n2.setLangI18n("DE");

		shiftI18n3.setStartI18n("Start");
		shiftI18n3.setEndI18n("End");
		shiftI18n3.setTypeI18n("النوع");
		shiftI18n3.setGetTitleI18n("فترة عم");
		shiftI18n3.setCreateTitleI18n("إنشاء");
		shiftI18n3.setEditTitleI18n("تحرير");
		shiftI18n3.setGetAllTitleI18n("فترة عم");
		shiftI18n3.setLangI18n("AR");

		shiftI18n4.setStartI18n("Démarrer");
		shiftI18n4.setEndI18n("Fin");
		shiftI18n4.setTypeI18n("Type");
		shiftI18n4.setGetTitleI18n("Shift");
		shiftI18n4.setCreateTitleI18n("Créer");
		shiftI18n4.setEditTitleI18n("Modifier");
		shiftI18n4.setGetAllTitleI18n("Shifts");
		shiftI18n4.setLangI18n("FR");

		shiftI18n5.setStartI18n("Inicio");
		shiftI18n5.setEndI18n("Fin");
		shiftI18n5.setTypeI18n("Tipo");
		shiftI18n5.setGetTitleI18n("Shift");
		shiftI18n5.setCreateTitleI18n("Crear");
		shiftI18n5.setEditTitleI18n("Editar");
		shiftI18n5.setGetAllTitleI18n("Turnos");
		shiftI18n5.setLangI18n("ES");

		shiftI18nRepository.save(shiftI18n);
		shiftI18nRepository.save(shiftI18n2);
		shiftI18nRepository.save(shiftI18n3);
		shiftI18nRepository.save(shiftI18n4);
		shiftI18nRepository.save(shiftI18n5);
	}

}
