package model.dao;

import java.util.List;

import model.entity.Product;

// product 資料表 CRUD
public interface ProductDao {
	void add(Product product); // 新增一筆紀錄
	
	void update(Integer productId, Product newProduct); // 修改紀錄, 根據指定 productId
	void updateQty(Integer productId, Integer newQty); // 修改庫存紀錄, 根據指定 productId
	
	void delete(Integer productId); // 刪除庫存紀錄, 根據指定 productId
	
	List<Product> findAll(); // 全部查詢
	
	Product getOne(Integer productId); // 單筆查詢
	
}
