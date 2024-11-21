package com.example.demo.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;

@Repository // 宣告一個 Repository 給 Spring 管理
public class RoomRepositoryJDBCImpl implements RoomRepositoryJDBC {
	
	@Autowired // 自動綁定(會自動採用 application.properties 有關於 spring.datasource 的設定資訊)
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Room> findAllRooms() {
		String sql = "select room_id, room_name, room_size from room";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Room.class));
	}

	@Override
	public Optional<Room> findRoomById(Integer roomId) {
		String sql = "select room_id, room_name, room_size from room where room_id = ?";
		try {
			// queryForObject(String sql, RowMapper<T> rowMapper, @Nullable Object... args)
			Room room = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Room.class), roomId);
			return Optional.of(room);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public int saveRoom(Room room) {
		String sql = "insert into room(room_id, room_name, room_size) values(?, ?, ?)";
		return jdbcTemplate.update(sql, room.getRoomId(), room.getRoomName(), room.getRoomSize());
	}

	@Override
	public int updateRoom(Room room) {
		String sql = "update room set room_name = ?, room_size = ? where room_id = ?";
		return jdbcTemplate.update(sql, room.getRoomName(), room.getRoomSize(), room.getRoomId());
	}

	@Override
	public int deleteById(Integer roomId) {
		String sql = "delete from room where room_id = ?";
		return jdbcTemplate.update(sql, roomId);
	}

}
