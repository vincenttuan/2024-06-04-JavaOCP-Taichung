package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import model.entity.Product;

public class ProductDaoImpl implements ProductDao {
	private static Connection conn;
	
	static {
		try {
			// 1.建立 Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.建立連線 Connection
			String username = "root";
			String password = "12345678";
			String dbUrl = "jdbc:mysql://localhost:3306/web?serverTimezone=Asia/Taipei";
			conn = DriverManager.getConnection(dbUrl, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer productId, Product newProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQty(Integer productId, Integer newQty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getOne(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
