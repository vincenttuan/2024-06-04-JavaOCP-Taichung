package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.exception.RoomNotFoundException;
import com.example.demo.mapper.RoomMapper;
import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepositoryJDBC roomRepositoryJDBC;
	
	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public List<RoomDTO> getAllRooms() {
		return roomRepositoryJDBC.findAllRooms() // List<Room>
								 .stream() // ... Room
								 //.map(room -> roomMapper.toDTO(room)) // ... RoomDTO
								 .map(roomMapper::toDTO) // ... RoomDTO
								 .collect(Collectors.toList()); // List<RoomDTO>
	}

	@Override
	public RoomDTO getRoomById(Integer roomId) {
		/*
		Optional<Room> optRoom = roomRepositoryJDBC.findRoomById(roomId);
		if(optRoom.isEmpty()) {
			//return null;
			// 自行建立一個例外物件
			RuntimeException re = new RuntimeException("查無此房間");
			throw re;
		}
		Room room = optRoom.get(); // 取得 room 實體
		RoomDTO roomDTO = roomMapper.toDTO(room);
		return roomDTO;
		*/
		Room room = roomRepositoryJDBC.findRoomById(roomId)
									  .orElseThrow(() -> new RoomNotFoundException("無此房間:" + roomId));
		return roomMapper.toDTO(room);
	}

	@Override
	public int addRoom(RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addRoom(Integer roomId, String roomName, Integer roomSize) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoom(RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoom(Integer roomId, RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRoom(Integer roomId, String roomName, Integer roomSize) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRoom(Integer roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
