package com.example.demo.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;

@Repository // 宣告一個 Repository 給 Spring 管理
@PropertySource("classpath:sql.properties") // 自動到 src/main/resources 找到 sql.properties
public class RoomRepositoryJDBCImpl implements RoomRepositoryJDBC {
	
	@Autowired // 自動綁定(會自動採用 application.properties 有關於 spring.datasource 的設定資訊)
	private JdbcTemplate jdbcTemplate;
	
	// 會透過 Spring DI 技術將資料注入給指定變數
	@Value("${room.sql.findAll}") // ${} SpringEL 語法 
	private String findAllSql;
	
	@Value("${room.sql.findById}")
	private String findByIdSql;
	
	@Value("${room.sql.save}")
	private String saveSql;
	
	@Value("${room.sql.update}")
	private String updateSql;
	
	@Value("${room.sql.deleteById}")
	private String deleteByIdSql;
	
	
	@Override
	public List<Room> findAllRooms() {
		return jdbcTemplate.query(findAllSql, new BeanPropertyRowMapper<>(Room.class));
	}

	@Override
	public Optional<Room> findRoomById(Integer roomId) {
		try {
			// queryForObject(String sql, RowMapper<T> rowMapper, @Nullable Object... args)
			Room room = jdbcTemplate.queryForObject(findByIdSql, new BeanPropertyRowMapper<>(Room.class), roomId);
			return Optional.of(room);
		} catch (Exception e) {
			// empty
		}
		return Optional.empty();
	}

	@Override
	public int saveRoom(Room room) {
		return jdbcTemplate.update(saveSql, room.getRoomId(), room.getRoomName(), room.getRoomSize());
	}

	@Override
	public int updateRoom(Room room) {
		return jdbcTemplate.update(updateSql, room.getRoomName(), room.getRoomSize(), room.getRoomId());
	}

	@Override
	public int deleteById(Integer roomId) {
		return jdbcTemplate.update(deleteByIdSql, roomId);
	}

}
