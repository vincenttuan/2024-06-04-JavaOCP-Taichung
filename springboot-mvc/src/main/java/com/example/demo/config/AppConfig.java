package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Springboot 啟動完成之前會先執行此程式 
public class AppConfig {
	
	// 由 Springboot 來管理此物件
	// 其他程式也可以透過 @Autowired 來取得該實體
	@Bean
	//@Scope("SingleTon") // 預設:單一物件
	//@Scope("Prototype") // 多物件
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
