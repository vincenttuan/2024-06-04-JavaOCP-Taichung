package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.entity.Room;

public interface RoomRepositoryJDBC {
	List<Room> findAllRooms(); // 查找所有房間(多筆)
	Optional<Room> findRoomById(Integer roomId); // 查找指定房間(單筆)
	int saveRoom(Room room);
	int updateRoom(Room room);
	int deleteById(Integer roomId);
}
