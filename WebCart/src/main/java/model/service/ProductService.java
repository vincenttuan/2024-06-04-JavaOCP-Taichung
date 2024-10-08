package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dao.ProductDao;
import model.dao.ProductDaoImpl;
import model.dto.ProductDto;
import model.entity.Product;

public class ProductService {
	
	private ProductDao productDao = new ProductDaoImpl();
	
	public List<ProductDto> queryAll() { // 全部查詢
		// 取得 List<Product> 集合
		List<Product> products = productDao.findAll();
		
		// 將 products 逐筆轉換成 ProductDto
		List<ProductDto> productDtos = new ArrayList<>();
		for(Product product : products) {
			// 建立 ProductDto 物件
			ProductDto productDto = new ProductDto();
			productDto.setId(product.getProductId());
			productDto.setName(product.getProductName());
			productDto.setPrice(product.getPrice());
			productDto.setQty(product.getQty());
			productDto.setTotal(product.getPrice() * product.getQty()); // 小計
			productDto.setImageBase64(product.getImageBase64());
			// 注入到 productDtos
			productDtos.add(productDto);
		}
		
		return productDtos;
	}
	
	// 新增商品
	public void add(String productName, String price, String qty, String imageBase64) {
		Product product = new Product();
		product.setProductName(productName);
		product.setPrice(Integer.parseInt(price)); // 將字串轉 int
		product.setQty(Integer.parseInt(qty)); // 將字串轉 int
		product.setImageBase64(imageBase64);
		// 傳給 dao 執行後續的新增程序
		productDao.add(product);
	}
	
}
