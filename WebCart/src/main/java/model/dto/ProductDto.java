package model.dto;

// Dto (Data transfer Object)
public class ProductDto {
	private Integer id; // 對應 entity.Product 的 productId 欄位
	private String name; // 對應 entity.Product 的 productName 欄位
	private Integer price; // 對應 entity.Product 的 price 欄位
	private Integer qty; // 對應 entity.Product 的 qty 欄位
	private Integer total; // 計算總和: price * qty
	private String imageBase64; // 圖片編碼
	
	public ProductDto(Integer id, String name, Integer price, Integer qty, String imageBase64) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.total = price * qty;
		this.imageBase64 = imageBase64;
	}
	
	public ProductDto() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getImageBase64() {
		return imageBase64;
	}

	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}

	
}
