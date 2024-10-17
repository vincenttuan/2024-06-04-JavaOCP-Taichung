package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;
import model.entity.User;

public class UserService {
	private UserDao userDao = new UserDaoImpl();
	
	public List<UserDto> findAllUsers() {
		List<User> users = userDao.findAllUsers(); // 完整 user 資料紀錄
		List<UserDto> userDtos = new ArrayList<>(); // 部分 user 資料紀錄
		for(User user : users) {
			UserDto userDto = new UserDto();
			userDto.setUserId(user.getUserId());
			userDto.setUsername(user.getUsername());
			userDto.setPriority(user.getPriority());
			// 注入到 userDtos
			userDtos.add(userDto);
		}
		return userDtos;
	}
	
	public UserDto loginCheck(String username, String password) {
		// 1.查找使用者
		User user = userDao.getUser(username);
		if(user == null) {
			return null;
		}
		// 2.比對密碼
		if(!user.getPassword().equals(password)) {
			return null;
		}
		// 3.將 User 轉 UserDto
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getUserId());
		userDto.setUsername(user.getUsername());
		userDto.setPriority(user.getPriority());
		return userDto;
	}
}
