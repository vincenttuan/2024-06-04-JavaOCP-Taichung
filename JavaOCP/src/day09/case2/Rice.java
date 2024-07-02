package day09.case2;

// 米飯類
public class Rice {
	private Double weight; // 單位: 克
	private Integer price; // 單位: 元
	
	public Rice(Double weight, Integer price) {
		this.weight = weight;
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}
