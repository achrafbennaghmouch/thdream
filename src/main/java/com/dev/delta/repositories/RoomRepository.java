package com.dev.delta.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.delta.entities.Room;
import com.dev.delta.entities.RoomType;

public interface RoomRepository extends JpaRepository<Room, Long> {
	Optional<Room> findById(Long id);

	@Query(nativeQuery = true, value = "select * from room i where i.status = 'Inactive' ")
	List<Room> findBookedRooms();

	@Query(nativeQuery = true, value = "select * from room i where i.status = 'Active' ")
	List<Room> findFreeRooms();

	@Query(nativeQuery = true, value = "select * from room i where i.status = 'Active' and i.room_type_id=:roomtype ")
	List<Room> findByRoomType(@Param("roomtype") RoomType roomType);
}
