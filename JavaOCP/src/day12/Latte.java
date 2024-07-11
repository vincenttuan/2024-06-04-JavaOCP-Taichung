package day12;

// 子類別 Latte
public class Latte extends Coffee {
	private int milkPrice; //牛奶價格
	
	// // 建構子: 設定/注入咖啡價格, 牛奶價格
	public Latte(int basePrice, int milkPrice) {
		super(basePrice);
		this.milkPrice = milkPrice;
	}
}
