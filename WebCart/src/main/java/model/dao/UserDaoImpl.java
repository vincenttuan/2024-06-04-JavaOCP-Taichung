package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	
	@Override
	public List<User> findAllUsers() {
		String sql = "select user_id, username, password, priority from users";
		List<User> users = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			// 走訪所有資料紀錄
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPriority(rs.getInt("priority"));
				// 注入到 users 集合
				users.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public User getUser(String username) {
		String sql = "select user_id, username, password, priority from users where username = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, username);
			// 開始查找
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					User user = new User();
					user.setUserId(rs.getInt("user_id"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setPriority(rs.getInt("priority"));
					return user;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
