package com.example.demo.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.RoomDTO;
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
		return null;
	}

	@Override
	public RoomDTO getRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		return null;
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
