package com.example.demo.service;

import java.util.List;

import com.example.demo.model.dto.RoomDTO;

public interface RoomService {
	public List<RoomDTO> getAllRooms();
	public RoomDTO getRoomById(Integer roomId);
	
	public int addRoom(RoomDTO roomDTO);
	public int addRoom(Integer roomId, String roomName, Integer roomSize);
	
	public int updateRoom(RoomDTO roomDTO);
	public int updateRoom(Integer roomId, RoomDTO roomDTO);
	public int updateRoom(Integer roomId, String roomName, Integer roomSize);
	
	public int deleteRoom(Integer roomId);
	
}
