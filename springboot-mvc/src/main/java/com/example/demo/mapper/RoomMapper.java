package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.entity.Room;

@Component
public class RoomMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RoomDTO toDTO(Room room) {
		// Entity 轉 DTO
		return modelMapper.map(room, RoomDTO.class);
	}
	
	public Room toEntity(RoomDTO roomDTO) {
		// DTO 轉 Entity
		return modelMapper.map(roomDTO, Room.class);
	}
	
}
