package model.dto;

// 銷售統計資訊
public class ProductSalesSummary {
	private Integer productId;
	private String productName;
	private Double total;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "ProductSalesSummary [productId=" + productId + ", productName=" + productName + ", total=" + total
				+ "]";
	}
	
}
