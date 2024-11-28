package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.entity.Room;

@Configuration // Springboot 啟動完成之前會先執行此程式 
public class AppConfig {
	
	// 由 Springboot 來管理此物件
	// 其他程式也可以透過 @Autowired 來取得該實體
	//@Bean
	//@Scope("SingleTon") // 預設:單一物件
	//@Scope("Prototype") // 多物件
	//ModelMapper modelMapper() {
	//	return new ModelMapper();
	//}
	
	@Bean
	ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		
		// 自訂映射
		// DTO -> Entity 映射規則
		PropertyMap<RoomDTO, Room> roomMapRule1 = new PropertyMap<RoomDTO, Room>() { // 規則一
			@Override
			protected void configure() {
				map(source.getId(), destination.getRoomId());
				map(source.getName(), destination.getRoomName());
				map(source.getSize(), destination.getRoomSize());
			}
		}; 	
		modelMapper.addMappings(roomMapRule1); // 加入新規則
		
		return modelMapper;
	}
	
}
