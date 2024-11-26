package com.example.demo.service;

import java.util.List;

import com.example.demo.model.dto.RoomDTO;

public interface RoomService {
	public List<RoomDTO> getAllRooms();
	public RoomDTO getRoomById(Integer roomId);
	
	public void addRoom(RoomDTO roomDTO);
	public void addRoom(Integer roomId, String roomName, Integer roomSize);
	
	public void updateRoom(RoomDTO roomDTO);
	public void updateRoom(Integer roomId, RoomDTO roomDTO);
	public void updateRoom(Integer roomId, String roomName, Integer roomSize);
	
	public void deleteRoom(Integer roomId);
	
}
