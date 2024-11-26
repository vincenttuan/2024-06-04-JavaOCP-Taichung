package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.exception.RoomAlreadyExistException;
import com.example.demo.exception.RoomException;
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
	public void addRoom(RoomDTO roomDTO) {
		// 判斷該 room 是否已經存在 ?
		Optional<Room> optRoom = roomRepositoryJDBC.findRoomById(roomDTO.getRoomId());
		if(optRoom.isPresent()) {
			throw new RoomAlreadyExistException("新增失敗,此房間已經存在:" + roomDTO.getRoomId());
		}
		Room room = roomMapper.toEntity(roomDTO);
		int rowcount = roomRepositoryJDBC.saveRoom(room);
		if(rowcount == 0) {
			throw new RoomException("無法新增");
		}
	}

	@Override
	public void addRoom(Integer roomId, String roomName, Integer roomSize) {
		RoomDTO roomDTO = new RoomDTO(roomId, roomName, roomSize);
		addRoom(roomDTO);
	}

	@Override
	public void updateRoom(RoomDTO roomDTO) {
		// 判斷該 room 是否存在 ?
		Optional<Room> optRoom = roomRepositoryJDBC.findRoomById(roomDTO.getRoomId());
		if(optRoom.isEmpty()) {
			throw new RoomNotFoundException("修改 room 失敗, room 不存在: " + roomDTO.getRoomId());
		}
		
	}

	@Override
	public void updateRoom(Integer roomId, RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRoom(Integer roomId, String roomName, Integer roomSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoom(Integer roomId) {
		// TODO Auto-generated method stub
		
	}

}
