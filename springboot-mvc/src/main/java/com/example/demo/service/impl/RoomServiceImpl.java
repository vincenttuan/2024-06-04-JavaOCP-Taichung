package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepositoryJDBC roomRepositoryJDBC;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<RoomDTO> getAllRooms() {
		return roomRepositoryJDBC.findAllRooms() // List<Room>
								 .stream() // ... Room
								 .map(room -> modelMapper.map(room, RoomDTO.class)) // ... RoomDTO
								 .collect(Collectors.toList()); // List<RoomDTO>
	}

	@Override
	public RoomDTO getRoomById(Integer roomId) {
		Optional<Room> optRoom = roomRepositoryJDBC.findRoomById(roomId);
		if(optRoom.isEmpty()) {
			//return null;
			// 自行建立一個例外物件
			RuntimeException re = new RuntimeException("查無此房間");
			throw re;
		}
		Room room = optRoom.get(); // 取得 room 實體
		RoomDTO roomDTO = modelMapper.map(room, RoomDTO.class);
		return roomDTO;
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
