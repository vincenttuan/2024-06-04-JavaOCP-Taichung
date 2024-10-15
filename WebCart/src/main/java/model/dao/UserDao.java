package model.dao;

import java.util.List;

import model.entity.User;

public interface UserDao {
	List<User> findAllUsers();
}
