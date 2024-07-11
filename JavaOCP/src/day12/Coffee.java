package day12;

// 父類別 Coffee
public class Coffee {
	int basePrice; // 咖啡價格
	
	// 建構子: 設定/注入咖啡價格
	public Coffee(int basePrice) {
		this.basePrice = basePrice;
	}
	
	public int calculatePrice() { // 計算並得到咖啡的價格
		return basePrice;
	}
	
	public void description() {
		System.out.println("這是一杯美式咖啡");
	}
}
