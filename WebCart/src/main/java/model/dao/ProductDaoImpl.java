package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Product;

public class ProductDaoImpl extends BaseDao implements ProductDao {
	
	@Override
	public void add(Product product) {
		String sql = "insert into product(product_name, price, qty, image_base64) values(?, ?, ?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setInt(3, product.getQty());
			pstmt.setString(4, product.getImageBase64());
			
			// 執行新增
			int rowcount = pstmt.executeUpdate();
			System.out.println("新增 product 資料表異動筆數: " + rowcount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		String sql = "select product_id, product_name, price, qty, image_base64 from product";
		List<Product> products = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			// 利用 while 逐筆讀取資料
			while (rs.next()) {
				Integer productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				Integer price = rs.getInt("price");
				Integer qty = rs.getInt("qty");
				String imageBase64 = rs.getString("image_base64");
				// 建立 Product 物件
				Product product = new Product();
				product.setProductId(productId);
				product.setProductName(productName);
				product.setPrice(price);
				product.setQty(qty);
				product.setImageBase64(imageBase64);
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
		String sql = "select product_id, product_name, price, qty, image_base64 from product where product_id = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, productId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				// 建立 Product 物件
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getInt("price"));
				product.setQty(rs.getInt("qty"));
				product.setImageBase64(rs.getString("image_base64"));
				return product;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
