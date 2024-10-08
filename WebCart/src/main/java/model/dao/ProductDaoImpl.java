package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		String sql = "insert into product(product_name, price, qty, image_base64) values(?, ?, ?, ?)";
		
		
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
		String sql = "select product_id, product_name, price, qty from product";
		List<Product> products = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			// 利用 while 逐筆讀取資料
			while (rs.next()) {
				Integer productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				Integer price = rs.getInt("price");
				Integer qty = rs.getInt("qty");
				// 建立 Product 物件
				Product product = new Product();
				product.setProductId(productId);
				product.setProductName(productName);
				product.setPrice(price);
				product.setQty(qty);
				// 注入到 products 集合中保存
				products.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public Product getOne(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
