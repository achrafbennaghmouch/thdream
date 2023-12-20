package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.RoomI18nRepository;
import com.dev.delta.repositories.RoomRepository;

@Service
public class RoomDTO implements DTO {

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	RoomI18nRepository roomI18nRepository;

	@Override
	public void populate() {

		room.setFloor("1");
		room.setRoomNo("1020");
		room.setRoomType(roomType1);
		room.setStatus("Active");
		room.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room);

		room1.setFloor("2");
		room1.setRoomNo("1023");
		room1.setRoomType(roomType1);
		room1.setStatus("Active");
		room1.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room1);

		room2.setFloor("1");
		room2.setRoomNo("1024");
		room2.setRoomType(roomType3);
		room2.setStatus("Active");
		room2.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room2);

		room3.setFloor("1");
		room3.setRoomNo("1022");
		room3.setRoomType(roomType2);
		room3.setStatus("Active");
		room3.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room3);

		room4.setFloor("2");
		room4.setRoomNo("1028");
		room4.setRoomType(roomType3);
		room4.setStatus("Active");
		room4.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room4);

		room5.setFloor("1");
		room5.setRoomNo("1030");
		room5.setRoomType(roomType2);
		room5.setStatus("Inactive");
		room5.setDescription(
				"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.   ");
		roomRepository.save(room5);

		roomI18n.setFloorI18n("Floor");
		roomI18n.setRoomNoI18n("Room No");
		roomI18n.setRoomTypeI18n("Room type");
		roomI18n.setStatusI18n("Status");
		roomI18n.setGetTitleI18n("Room");
		roomI18n.setCreateTitleI18n("Create");
		roomI18n.setEditTitleI18n("Edit");
		roomI18n.setGetAllTitleI18n("Rooms");
		roomI18n.setLangI18n("EN");
		roomI18nRepository.save(roomI18n);

		roomI18n2.setFloorI18n("Gebäudeplan");
		roomI18n2.setRoomNoI18n("Zimmernummer");
		roomI18n2.setRoomTypeI18n("Zimmertyp");
		roomI18n2.setStatusI18n("Status");
		roomI18n2.setGetTitleI18n("Zimmer");
		roomI18n2.setCreateTitleI18n("Erstellen");
		roomI18n2.setEditTitleI18n("Bearbeiten");
		roomI18n2.setGetAllTitleI18n("Räume");
		roomI18n2.setLangI18n("DE");
		roomI18nRepository.save(roomI18n2);

		roomI18n3.setFloorI18n("طابق");
		roomI18n3.setRoomNoI18n("رقم الغرفة");
		roomI18n3.setRoomTypeI18n("نوع الغرفة");
		roomI18n3.setStatusI18n("الحالة");
		roomI18n3.setGetTitleI18n("الغرفة");
		roomI18n3.setCreateTitleI18n("إنشاء");
		roomI18n3.setEditTitleI18n("تحرير");
		roomI18n3.setGetAllTitleI18n("الغرف");
		roomI18n3.setLangI18n("AR");
		roomI18nRepository.save(roomI18n3);

		roomI18n4.setFloorI18n("Sol");
		roomI18n4.setRoomNoI18n("Room No");
		roomI18n4.setRoomTypeI18n("Type de pièce");
		roomI18n4.setStatusI18n("Statut");
		roomI18n4.setGetTitleI18n("Chambre");
		roomI18n4.setCreateTitleI18n("Créer");
		roomI18n4.setEditTitleI18n("Modifier");
		roomI18n4.setGetAllTitleI18n("Chambres");
		roomI18n4.setLangI18n("FR");
		roomI18nRepository.save(roomI18n4);

		roomI18n5.setFloorI18n("Piso");
		roomI18n5.setRoomNoI18n("Habitación No");
		roomI18n5.setRoomTypeI18n("Tipo de habitación");
		roomI18n5.setStatusI18n("Estado");
		roomI18n5.setGetTitleI18n("Habitación");
		roomI18n5.setCreateTitleI18n("Crear");
		roomI18n5.setEditTitleI18n("Editar");
		roomI18n5.setGetAllTitleI18n("Habitaciones");
		roomI18n5.setLangI18n("ES");
		roomI18nRepository.save(roomI18n5);

	}

}
