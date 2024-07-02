package day09.case2;

// 火腿類
public class Ham {
	private String name; // 名稱
	private Double weight; // 單位:克
	private Integer price; // 單位:元
	
	// 建構子
	public Ham(String name, Double weight, Integer price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	// 方法封裝
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
