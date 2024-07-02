package day09.case2;

// 雞蛋類
public class Egg {
	private Integer amount; // 雞蛋的數量
	private Integer price; // 每一顆雞蛋的價格
	
	public Egg(Integer amount, Integer price) {
		this.amount = amount;
		this.price = price;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
